package com.itbank.repository;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.itbank.model.BoardDTO;

@Repository
public interface BoardDAO {

	List<BoardDTO> selectList();


	BoardDTO selectOne(int idx);
	// BoardDTO : resultType
	// int : parameterType
	//selectOne : id
	/* <select id="selectOne"
				parameterType="int"
				resultType="board">
	 select * from board where idx = #{idx}
		</select>*/


	int insert(BoardDTO dto);


	int delete(int idx);
}
