package com.itbank.model;

import org.springframework.web.multipart.MultipartFile;

//IDX          NOT NULL NUMBER        
//PRODUCTNAME  NOT NULL VARCHAR2(500) 
//PRODUCTIMAGE NOT NULL VARCHAR2(500) 
//PRICE        NOT NULL NUMBER        
//AMOUNT                NUMBER 

public class ProductDTO {

	private int idx;
	private String productName;
	private String productImage;
	private int price;
	private int amount;
	
	private MultipartFile upload1;
	
	
	public MultipartFile getUpload1() {
		return upload1;
	}
	public void setUpload1(MultipartFile upload1) {
		this.upload1 = upload1;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
