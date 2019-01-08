package iot.project.smartbaby.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import iot.project.smartbaby.HomeController;

@Controller
public class HelloController {
	
	private static final Logger logger =
			LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/hello")
	public ModelAndView hello() {
		logger.info("/hello 요청처리");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("test/hello");		// 모델의 이름 설정
		mav.addObject("greeting", getGreeting());	// 모델의 데이터 설정
		
		return mav;
	}
	
	private String getGreeting() {
		return "안녕하세요";
	}
			

}
