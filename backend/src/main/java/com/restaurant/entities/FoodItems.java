package com.restaurant.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "FoodItems")
public class FoodItems {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	private String productName;
	private float productPrice;
	

	@ManyToOne
	@JoinColumn(name = "productcategoryId")
	private Category category;
	private String productStatus="Enabled";
	@OneToMany(mappedBy = "orderItemProduct",cascade = CascadeType.REMOVE)
	List<OrderItem> ordersItemList;
	public FoodItems() {
		// TODO Auto-generated constructor stub
	}
	

	public FoodItems(int productId) {
		super();
		this.productId = productId;
	}


	public FoodItems(int productId, String productName, float productPrice,  String productStatus) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productStatus = productStatus;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}


	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}


	@Override
	public String toString() {
		return "FoodItems [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", category=" + category + ", productStatus=" + productStatus + ", ordersItemList=" + ordersItemList
				+ "]";
	}


	
	
}
