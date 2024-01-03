package jp.ken.testhotel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Mscontroller {
	
	
	
	@RequestMapping(value = "ms", method = RequestMethod.GET)
	public String Tomaster() {
		
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
	
	@RequestMapping(value = "view", method = RequestMethod.GET)
	public String toView() {
		return "view";
	}
	
	@RequestMapping(value = "start", method = RequestMethod.GET)
	public String toStart() {
		return "start";
	}

}
