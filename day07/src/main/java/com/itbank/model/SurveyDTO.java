package com.itbank.model;

import org.springframework.web.multipart.MultipartFile;

//IDX      NOT NULL NUMBER         
//TITLE    NOT NULL VARCHAR2(500)  
//WRITER   NOT NULL VARCHAR2(100)  
//CONTENTA NOT NULL VARCHAR2(4000) 
//IMAGEA   NOT NULL VARCHAR2(4000) 
//CONTENTB NOT NULL VARCHAR2(4000) 
//IMAGEB   NOT NULL VARCHAR2(4000)

public class SurveyDTO {
	
	private int idx;
	private String title;
	private String writer;
	private String contentA;
	private String imageA;
	private String contentB;
	private String imageB;
	
	private MultipartFile uploadA;	// 파라미터 값으로 가져올려고 
	private MultipartFile uploadB;
	
	public MultipartFile getUploadA() {
		return uploadA;
	}
	public void setUploadA(MultipartFile uploadA) {
		this.uploadA = uploadA;
	}
	public MultipartFile getUploadB() {
		return uploadB;
	}
	public void setUploadB(MultipartFile uploadB) {
		this.uploadB = uploadB;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContentA() {
		return contentA;
	}
	public void setContentA(String contentA) {
		this.contentA = contentA;
	}
	public String getImageA() {
		return imageA;
	}
	public void setImageA(String imageA) {
		this.imageA = imageA;
	}
	public String getContentB() {
		return contentB;
	}
	public void setContentB(String contentB) {
		this.contentB = contentB;
	}
	public String getImageB() {
		return imageB;
	}
	public void setImageB(String imageB) {
		this.imageB = imageB;
	}
	
}
