package com.itbank.repository;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import com.itbank.model.Survey_ChoiceDTO;

@Repository
public interface ChoiceDAO {

	//IDX        NOT NULL NUMBER        
	//WRITER              VARCHAR2(500) 
	//SURVEY_IDX          NUMBER        
	//CHOICE              NUMBER 
	
	@Insert("insert into survey_choice "
			+ "(writer, survey_idx, choice)"
			+ "values (#{writer}, #{survey_idx}, #{choice})")
	int insert(Survey_ChoiceDTO dto);

	
}
