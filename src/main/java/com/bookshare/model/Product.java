package com.bookshare.model;

public class Product {

	String name;
	String type;
	String calories;
	String size;
	String fat;
	String id;
	
	public Product(String name, String type, String calories, String size, String fat, String id){
		this.name = name;
		this.type = type;
		this.calories = calories;
		this.size = size;
		this.fat = fat;
		this.id = id;
	}
	public Product(){
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCalories() {
		return calories;
	}
	public void setCalories(String calories) {
		this.calories = calories;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getFat() {
		return fat;
	}
	public void setFat(String fat) {
		this.fat = fat;
	}
	
}
