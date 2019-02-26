package com.kyle.productcrud.soap;

import java.util.List;

import com.kyle.productcrud.soap.entities.Product;

public interface ProductWs {

	List<Product> getProducts();
	
	
	Product getProduct(int id);
	
	Product createProduct(Product product);
	
	Product updateProduct(Product product);
}
