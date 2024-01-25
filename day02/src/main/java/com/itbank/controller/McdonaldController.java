package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.member.McdonaldDTO;
import com.itbank.service.McdonaldService;

@Controller
public class McdonaldController {
	
	@Autowired private McdonaldService ms;
	
	
	@GetMapping("/mcdonald/{category}")
	public ModelAndView hamburgerList(@PathVariable("category") String category) {
		ModelAndView mav = new ModelAndView("mcdonald-list");
		List<McdonaldDTO> list = ms.getMcdonaldList(category);
		mav.addObject("list", list);
		return mav;
	}
	
	@GetMapping("/mcdonald/add")
	public ModelAndView hamburgerAdd() {
		ModelAndView mav = new ModelAndView("mcdonald-add");
		return mav;
	}
	
	@PostMapping("/mcdonald/add")
	public ModelAndView hamburgerAdd(McdonaldDTO dto) {
		ModelAndView mav = new ModelAndView("redirect:/mcdonald/all");
		int row = ms.add(dto);
		System.out.println(row != 0 ? "추가 성공" : "추가 실패");
		return mav;
	}
	
	@GetMapping("/mcdonald/view/{idx}")
	public ModelAndView view(@PathVariable("idx")int idx) {
		ModelAndView mav = new ModelAndView("mcdonald-view");
		McdonaldDTO dto = ms.getSelectOne(idx);
		mav.addObject("dto", dto);
		return mav;
	}
	
	
	@GetMapping("/mcdonald/delete/{idx}")
	public ModelAndView delete(@PathVariable("idx")int idx) {
		ModelAndView mav = new ModelAndView("alert");
		int row = ms.delete(idx);
		String message = row != 0 ? "삭제 성공" : "삭제 실패";
		String url = "/mcdonald/all";
		
		mav.addObject("message", message);
		mav.addObject("url", url);
		
		return mav;
	}
	
}
