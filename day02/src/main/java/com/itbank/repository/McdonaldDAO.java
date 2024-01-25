package com.itbank.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.itbank.member.McdonaldDTO;

@Repository
public interface McdonaldDAO {

   @Select("<script>"
	         + "select * from mcdonald "
	         + " <if test=\"category != null\">"
	         + "      where category = #{category}"
	         + " </if>"
	         + " order by idx"
	         + "</script>")
	List<McdonaldDTO> selectList(String columnValue);
	

	@Insert("insert into mcdonald (category, name, price, memo, imgName)"
			+ " values ( #{category}, #{name}, #{price}, #{memo}, #{imgName} )")
	int insert(McdonaldDTO dto);

	@Delete("delete from mcdonald where idx = #{idx}")
	int delete(int idx);


	@Select("select * from mcdonald where idx = #{idx}")
	McdonaldDTO selectOne(int idx);
}
