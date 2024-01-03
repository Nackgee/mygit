package jp.ken.hotel.msController;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jp.ken.hotel.model.HotelDAO;
import jp.ken.hotel.model.HotelDTO;

@Controller
public class Mscontroller {
	
	@Autowired
	private HotelDAO hotelDao;
	
	
	@RequestMapping(value = "master", method = RequestMethod.GET)
	public String Tomaster(@ModelAttribute HotelDTO hotelDot, Model model) {
		
		List<HotelDTO> hotelList = hotelDao.masterList();
		model.addAttribute("hotelList", hotelList);
		
		return "master";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String tologin() {
		
		return "login";
	}
	
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public String toJoing() {
		return "join";
	}
	
	@RequestMapping(value = "start", method = RequestMethod.GET)
	public String toStart() {
		return "start";
	}
	
	@RequestMapping(value = "hotelPage", method = RequestMethod.GET)
	public String hotelPage(@RequestParam("name") String name, HotelDTO hotelDTO, Model model,
		HttpSession session) {
	    hotelDTO = hotelDao.hotelPage(name);
	    model.addAttribute("hotelDTO", hotelDTO);
	    return "hotelPage";
	   }
	
	

}
