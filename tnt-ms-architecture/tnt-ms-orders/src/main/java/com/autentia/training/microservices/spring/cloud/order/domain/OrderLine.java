package com.autentia.training.microservices.spring.cloud.order.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="order_line")
public class OrderLine {

	@Id
	private Long id;
	
	@Column(name="product_id")
	private Integer productId;

	@ManyToOne
	private Order order;
	
	@Column
	private Long quantity;
	
	@Column
	private BigDecimal price;
	
	public Long getId() {
		return this.id;
	}
	
	public Integer getProductId() {
		return this.productId;
	}
	
	public Long getQuantity() {
		return quantity;
	}
	
	public BigDecimal getPrice() {
		return price;
	}

}
