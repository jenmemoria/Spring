package com.itbank.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.itbank.model.SurveyDTO;

@Repository
public interface SurveyDAO {

	@Select("select * from survey order by idx")
	List<SurveyDTO> selectList();
	
//	TITLE    NOT NULL VARCHAR2(500)  
//	WRITER   NOT NULL VARCHAR2(100)  
//	CONTENTA NOT NULL VARCHAR2(4000) 
//	IMAGEA   NOT NULL VARCHAR2(4000) 
//	CONTENTB NOT NULL VARCHAR2(4000) 
//	IMAGEB   NOT NULL VARCHAR2(4000
	@Insert("insert into survey (writer, title, contentA, imageA, contentB, imageB) "
			+ " values (#{writer}, #{title}, #{contentA}, #{imageA}, #{contentB}, #{imageB})")
	int insert(SurveyDTO dto);

	@Select("select * from survey where idx = #{idx}")
	SurveyDTO selectOne(int idx);

	
}
