package com.howoo.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {

	@GetMapping("/")
	public ModelAndView index() throws Exception{
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("index");
		
		return mav;
	}
	
	@GetMapping("/board")
	public ModelAndView board() throws Exception{
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("board");
		
		return mav;
	}
}
