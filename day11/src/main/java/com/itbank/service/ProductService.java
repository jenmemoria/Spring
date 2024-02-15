package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.component.FileComponent;
import com.itbank.model.ProductDTO;
import com.itbank.repository.ProductDAO;



@Service
public class ProductService {

	@Autowired private ProductDAO dao;
	@Autowired private FileComponent fileComponent;
	
	public List<ProductDTO> getProductList() {
		return dao.selectList();
	}

	public int insert(ProductDTO dto) {
		String productImage = fileComponent.upload(dto.getUpload1());
		dto.setProductImage(productImage);
		return dao.insert(dto);
	}

	public ProductDTO getProduct(int idx) {
		return dao.selectOne(idx);
	}


}
