package com.kyle.productcrud.soap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kyle.productcrud.soap.entities.Product;
import com.kyle.productcrud.soap.repos.ProductRepository;

public class ProductWsImpl implements ProductWs {
	
	@Autowired
	private ProductRepository productRepo;

	@Override
	public List<Product> getProducts() {
		return productRepo.findAll();
	}

	@Override
	public Product getProduct(int id) {
		return productRepo.findById(id).get();
	}

	@Override
	public Product createProduct(Product product) {
		return productRepo.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		return productRepo.save(product);
	}

}
