package fi.haagahelia.JansKitchenBackEnd.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class JansKitchenController {
	@RequestMapping("/hello")
	public String hello() {
		return "Hello Spring";
	}
}