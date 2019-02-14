package com.example.test.ui.views.orderedit;

import com.example.test.backend.data.entity.OrderItem;

public class OrderItemDeletedEvent {

	private OrderItem orderItem;

	public OrderItemDeletedEvent(OrderItem orderItem) {
		this.orderItem = orderItem;
	}

	public OrderItem getOrderItem() {
		return orderItem;
	}
}
