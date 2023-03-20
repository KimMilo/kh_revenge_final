package kh.com.job.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/business")
public class BsMainController {
	
	@GetMapping("/main")
	public ModelAndView main(ModelAndView mv) {
		
		return mv;
	}
		
}
