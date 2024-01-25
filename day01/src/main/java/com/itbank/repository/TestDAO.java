package com.itbank.repository;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class TestDAO {
	
	@Autowired private JdbcTemplate jdbcTemplate;		// 스프링빈은 오토와이어로 참조가 된다, root context에 있는 jdbcTemplate을 참조

	public String selectBanner() {
		String sql = "select banner from v$version";
		
//		RowMapper<String> rowMapper = new RowMapper<String>() {
//			
//			@Override
//			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
//				
//				return rs.getString("banner"); // getmapping은 요청주소를 말한다.
//			}
//		};		주석처리한게 바로 밑 한줄이랑 똑같다.
		
		RowMapper<String> rowMapper = (rs, rownum) -> rs.getString("banner");
		
		String version = jdbcTemplate.queryForObject(sql, rowMapper);
		return version;
	}

	public Date selectDay() {
		String sql = "select sysdate from dual";
		
		RowMapper<Date> rowMapper = (rs, rownum) -> rs.getDate("sysdate");
		
		
		return jdbcTemplate.queryForObject(sql, Date.class);
	}
	

}
