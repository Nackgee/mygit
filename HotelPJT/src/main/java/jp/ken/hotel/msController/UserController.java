package jp.ken.hotel.msController;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import jp.ken.hotel.model.HotelDAO;
import jp.ken.hotel.model.HotelDTO;
import jp.ken.hotel.model.UserDAO;
import jp.ken.hotel.model.UserDTO;

@Controller
@SessionAttributes({"loginModel", "memberModel"})
public class UserController {
	
	@Autowired
	UserDAO userDao;
	
	@Autowired
	HotelDAO hotelDao;
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String Login(@ModelAttribute UserDTO userDto, Model model, HttpSession session) {
		
		UserDTO loginuser = userDao.login(userDto);
		
		if(loginuser == null) {
			model.addAttribute("message", "E-mailや電話番号が間違えました。");
			return "login";
		}
		else {
			session.setAttribute("userModel", loginuser);
			List<HotelDTO> hotelList = hotelDao.masterList();
			model.addAttribute("hotelList", hotelList);
			return "redirect:/master";
		}
	}
	
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String Logout(Model model, HttpSession session) {
		session.setAttribute("userModel", null);
		
		List<HotelDTO> hotelList = hotelDao.masterList();
		model.addAttribute("hotelList", hotelList);
		return "master";
	}
	
	@RequestMapping(value = "join", method = RequestMethod.POST)
	public String Join(@ModelAttribute UserDTO userdto, Model model, HttpSession session) {
		
		if(userdto.getEmail() == userdto.getEmail().trim().replace(" ", "")) {
			UserDTO dto = userDao.join(userdto);
			
			if(dto.getName() == null) {
				model.addAttribute("message", "使用中のE-mailです。");
				return "join";
			}
			
			else {
				session.setAttribute("userModel", dto);
				List<HotelDTO> hotelList = hotelDao.masterList();
				model.addAttribute("hotelList", hotelList);
				// 공부를 위해서 리다이렉트를 사용하지 않음
				return "master";
			}
		}
		
		else {
			model.addAttribute("message", "공백 금지");
			return "join";
		}
		
		
	}
	
	@RequestMapping(value = "modify", method = RequestMethod.GET)
	public String toMOdify(HttpSession session, Model model) {
		// 접근제한
		if(session.getAttribute("userModel") == null) {
			List<HotelDTO> hotelList = hotelDao.masterList();

			model.addAttribute("hotelList", hotelList);
			return "master";
		}
		return "modify";
	}
	
	@RequestMapping(value = "modify", method = RequestMethod.POST)
	public String Modify(@ModelAttribute UserDTO userdto, HttpSession session, Model model) {
		
		// 세션은 오브잭트로 반환하기 때문에 다운캐스팅 해줘야함
		UserDTO dto = (UserDTO) session.getAttribute("userModel");
		String id = dto.getUser_id();
		
		// 폼에서 ID는 받아올 수 없기 때문에 세션에서 받아와서 추가 (값이 다 들어간 DTO 완성)
		userdto.setUser_id(id);
		
		
		if(userdto.getEmail() == userdto.getEmail().trim().replace(" ", "")) {
			
			// 업데이트는 기본적으로 int 반환(위에 join의 dao에서는 dto반환을 위해 sql을 2번 사용
			int result = userDao.modify(userdto);
			
			if(result ==1) {
				session.setAttribute("userModel", null);
				List<HotelDTO> hotelList = hotelDao.masterList();
				model.addAttribute("hotelList", hotelList);
				return "master";
			}
			
			else {
				model.addAttribute("message", "使用中のE-mailです。");
				return "modify";
			}
		}
		
		else {
			model.addAttribute("message", "공백 금지");
			return "modify";
		}
	}
	
	
	
	
}
