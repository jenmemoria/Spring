package com.itbank.repository;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.itbank.model.MemberDTO;

@Repository
public interface memberDAO {

	@Select("select * from member order by idx")
	List<MemberDTO> selectList();

	@Select("select * from member where userid = #{userid} and userpw = #{userpw}")
	MemberDTO login(MemberDTO dto);

	
}
