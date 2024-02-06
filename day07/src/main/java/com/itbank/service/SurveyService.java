package com.itbank.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.SurveyDTO;
import com.itbank.repository.SurveyDAO;

@Service
public class SurveyService {

	@Autowired private SurveyDAO dao;

	private String saveDirectory = "C:\\upload";
	
	public SurveyService() {
		File dir = new File(saveDirectory);
		if(dir.exists() == false) {
			dir.mkdirs();
		}
	}
	
	public int register(SurveyDTO dto) {
		String imageA = dto.getUploadA().getOriginalFilename();
		String imageB = dto.getUploadB().getOriginalFilename();
		
		File f1 = new File(saveDirectory, imageA);
		File f2 = new File(saveDirectory, imageB);
		
		try {
			dto.getUploadA().transferTo(f1);
			dto.getUploadB().transferTo(f2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		dto.setImageA(imageA);
		dto.setImageB(imageB);
		
		return dao.insert(dto);
	}
	
	
	public List<SurveyDTO> getSurveyList() {
		// TODO Auto-generated method stub
		return dao.selectList();
	}

	// 게시글 자세히 보기
	public SurveyDTO getBoard(int idx) {
		return dao.selectOne(idx);
	}


	
	
	
}
