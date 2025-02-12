package org.kakao.kakaoshopping.web.dto.order.response;

import org.kakao.kakaoshopping.domain.entity.order.OrderItem;

import lombok.Data;

@Data
public class OrderItemSimpleView {

	private Long id;

	private Long itemId;

	private Integer quantity;

	public OrderItemSimpleView(OrderItem orderItem) {
		this.id = orderItem.getId();
		this.itemId = orderItem.getItem().getId();
		this.quantity = orderItem.getQuantity();
	}
}
