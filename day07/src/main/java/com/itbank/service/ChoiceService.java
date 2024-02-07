package com.itbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.Survey_ChoiceDTO;
import com.itbank.repository.ChoiceDAO;

@Service
public class ChoiceService {

	@Autowired private ChoiceDAO dao;
	
	public int insert(Survey_ChoiceDTO dto) {
		return dao.insert(dto);
	}

}
