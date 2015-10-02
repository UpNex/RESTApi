package com.bookshare.utility;

import java.util.HashMap;

import com.bookshare.model.Product;

/**
 * maintain the list of products for quick access
 * @author ramnivasindani
 *
 */
public class ProductUtils {
	private static HashMap<String,Product> productCollections = new HashMap<String,Product>();
	
	public static void setProductDetails(Product product){
		productCollections.put(product.getId(), product);
	}
	
	public static Product getProductDetails(String productId){
		return productCollections.get(productId);
	}
}
