package kr.pmadvisor.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController2 {

	private static final Logger logger = 
			LoggerFactory.getLogger(SampleController2.class);
	
	@RequestMapping("doC")
	public String doC( @ModelAttribute("msg") String msg) {
		
		logger.info("doC.................................");
		
		return "result"; // result.jsp 		
		
	}
}
