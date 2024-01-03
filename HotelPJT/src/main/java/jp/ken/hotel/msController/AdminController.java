package jp.ken.hotel.msController;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jp.ken.hotel.model.AdminDAO;
import jp.ken.hotel.model.AdminDTO;
import jp.ken.hotel.model.HotelDAO;
import jp.ken.hotel.model.HotelDTO;

@Controller
public class AdminController {
	
	@Autowired
	private AdminDAO adminDao;
	
	@Autowired
	private HotelDAO hotelDao;
	
	@RequestMapping(value = "adminLogin", method = RequestMethod.GET)
	public String admingLoginForm() {
		return "adminLogin";
	}
	
  @RequestMapping(value = "adminLogin", method = RequestMethod.POST)
   public String processLogin(@ModelAttribute AdminDTO admin, Model model, HttpSession session) {
      AdminDTO result = adminDao.checkAdmin(admin);
      try {
    	  if (result != null) {
    	         session.setAttribute("adminSession", result);
    	         List<HotelDTO> hotelList = hotelDao.masterList();
    	         model.addAttribute("hotelList", hotelList);
    	         return "adminMain";
    	      } 
    	  else {
    	         return "adminLogin";
    	      }
    	  
      } catch (NullPointerException e) {
    	  return "adminLogin";
	}
      
   }
  
  @RequestMapping(value = "adminMain", method = RequestMethod.GET)
  public String toMain(HttpSession session, Model model) {
	  try {
		  if(session.getAttribute("adminSession").equals(null) == false) {
			  List<HotelDTO> hotelList = hotelDao.masterList();
			  model.addAttribute("hotelList", hotelList);
			  return "adminMain";
		  }
	  } catch (Exception e) {
		  return "adminLogin";
	  }
	  return "adminLogin";
  }
  
  @RequestMapping(value = "adminView", method = RequestMethod.GET)
  public String toView(@RequestParam("name") String name, HotelDTO hotelDTO, Model model,
		  				HttpSession session) {
	  if(session.getAttribute("adminSession").equals(null) == false) {
		  hotelDTO = hotelDao.hotelPage(name);
		  model.addAttribute("hotelDTO", hotelDTO);
		  return "adminView";
	  }
	  
	  return "adminLogin";
  }
  
  
  
  @RequestMapping(value = "addHotel", method = RequestMethod.GET)
  public String addHotel(HttpSession session) {
	  
	  try {
		  if(session.getAttribute("adminSession").equals(null) == false) {
			  return "addHotel";
		  }
	  }	catch (Exception e) {
		  return "redirect:/adminLogin";
	  }
	  return null;
  }
  
  @RequestMapping(value = "addHotel", method = RequestMethod.POST)
  public String addHotel(@ModelAttribute HotelDTO hotelDTO,
        @RequestParam("file1") MultipartFile file1,
        @RequestParam("file2") MultipartFile file2,
        @RequestParam("file3") MultipartFile file3,
        Model model,
        HttpSession session) {

     try {
        handleFileUpload(hotelDTO, file1, file2, file3);
        System.out.println("files exist");
     } catch (Exception e) {
        e.printStackTrace();
     }
     HotelDTO hotelDto = adminDao.addHotel(hotelDTO, file1, file2, file3);
     if (hotelDto != null && hotelDto.getName() != null) {
        session.setAttribute("hotelDto", hotelDto);
        List<HotelDTO> hotelList = hotelDao.masterList();
        model.addAttribute("hotelList", hotelList);
        return "redirect:/master";
     } else {
        System.err.println("Hotel addition failed");
        return "addHotel";
     }
  }
  
  private static final String UPLOADS_DIR = "/HotelPJT/src/main/webapp/resources/img";

  private void handleFileUpload(HotelDTO hotelDTO,
        MultipartFile file1,
        MultipartFile file2,
        MultipartFile file3) {
     try {
        hotelDTO.setSavedfile1(handleSingleFile(file1));
        hotelDTO.setSavedfile2(handleSingleFile(file2));
        hotelDTO.setSavedfile3(handleSingleFile(file3));
     } catch (IOException e) {
        e.printStackTrace();
     }
  }

  private String handleSingleFile(MultipartFile file) throws IOException {
     if (file != null && !file.isEmpty()) {
        String originalFileName = file.getOriginalFilename();
        String savedFileName = generateUniqueFileName(originalFileName);
        String filePath = UPLOADS_DIR + savedFileName;

        File destinationFile = new File(filePath);
        FileUtils.writeByteArrayToFile(destinationFile, file.getBytes());
        System.out.println(file.getName());

        System.out.println("File uploaded: " + savedFileName);
        return savedFileName;
     }
     return null;
  }

  private String generateUniqueFileName(String originalFileName) {
     // make uniue file name
     return UUID.randomUUID().toString() + "_" + originalFileName;
  }
  
  @RequestMapping(value = "Pdelete", method = RequestMethod.GET)
  public String deleteHotel(@RequestParam("name") String name, HotelDTO hotelDTO,
		  HttpSession session) {
	  
	  int result = adminDao.delet(name);
	  
	  if(result == 1) {
		  return "redirect:/adminMain";
	  }
	  
	  else {
		  return "adminView";
	  }
  }
  
  
  
}
