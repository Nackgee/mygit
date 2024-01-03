package jp.ken.hotel.msController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.ken.hotel.model.HotelDAO;
import jp.ken.hotel.model.HotelDTO;

@Controller
public class CateController {

	@Autowired HotelDAO hotelDao;
	
	@RequestMapping(value = "master", method = RequestMethod.POST)
	public String POOL(@ModelAttribute HotelDTO hoteldto, Model model) {
		System.out.println(hoteldto.getHotel_cat());
		
		List<HotelDTO> cateList = hotelDao.cateList(hoteldto.getHotel_cat());
		model.addAttribute("hotelList", cateList);
		
		return "master";
	}
	
}
