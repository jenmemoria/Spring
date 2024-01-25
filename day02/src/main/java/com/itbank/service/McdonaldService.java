package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.member.McdonaldDTO;
import com.itbank.repository.McdonaldDAO;


enum McdonaldCategory {
	all(null),
	burger("버거"),
	drink("음료");
	
	private String columnValue;
	
	McdonaldCategory(String columnValue){
		this.columnValue = columnValue;
	}
	public String getColumnName() {
		return columnValue;
	}
	
}
@Service
public class McdonaldService {

	@Autowired private McdonaldDAO dao;
	public List<McdonaldDTO> getMcdonaldList(String category){
		String columnValue = null;
		
		McdonaldCategory e1 = McdonaldCategory.valueOf(category);
		columnValue = e1.getColumnName();
		
		System.out.println("category : " + category);
		System.out.println("columnValue : " + columnValue);
		System.out.println();
		return dao.selectList(columnValue);
	}
	
	
	public int add(McdonaldDTO dto) {
		int row = dao.insert(dto);
		return row;
	}

	public int delete(int idx) {
		int row = dao.delete(idx);
		return row;
	}

	public McdonaldDTO getSelectOne(int idx) {
		return dao.selectOne(idx);
	}
	
}
