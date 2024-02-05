package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.MemberDTO;
import com.itbank.repository.memberDAO;

@Service
public class MemberService {

	@Autowired private memberDAO dao;
	
	public List<MemberDTO> getMemberList(){
		List<MemberDTO> list = dao.selectList();
		list.forEach(dto -> dto.setUserpw("********"));
		return list;
	}

	public MemberDTO login(MemberDTO dto) {
		return dao.login(dto);
	}
	
}
