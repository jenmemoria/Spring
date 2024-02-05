package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.SurveyDTO;
import com.itbank.service.SurveyService;

@Controller
@RequestMapping("/survey")
public class SurveyController {

	@Autowired private SurveyService surveyService;
	
	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		List<SurveyDTO> list = surveyService.getSurveyList();
		mav.addObject("list", list);
		return mav;
	}
	
	@GetMapping("/register")
	public void register() {}
	
	@PostMapping("/register")
	public String register(SurveyDTO dto) {
		int row = surveyService.register(dto);
		System.out.println(row != 0 ? "등록 성공" : "등록 실패");
		return "rediret:/survey/list";
	}
	
}
