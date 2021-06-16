package com.bridgelabz.bookstore.dto;

import lombok.Data;

@Data
public class OrderDto {
	
	private Long orderId;
	
	private String orderStatus;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	

//	private List<Quantity> QuantityOfBooks;
//	
//	private List<Book> BooksList;

}
