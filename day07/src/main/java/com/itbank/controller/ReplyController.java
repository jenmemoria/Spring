package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.SurveyDTO;
import com.itbank.service.SurveyService;

@Controller
@RequestMapping("/result")
public class ReplyController {

	@Autowired private SurveyService surveyService;
	
	@GetMapping("/view/{idx}")
	public ModelAndView view(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("/result/view");
		SurveyDTO dto = surveyService.getBoard(idx);
		mav.addObject("dto", dto);
		return mav;
	}
	
}
