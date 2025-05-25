package com.estudos.curso.entities;

import java.io.Serializable;
import java.util.Objects;

import com.estudos.curso.entities.pk.OrderItemPK;
<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonIgnore;
=======
>>>>>>> ad8e4f4bf7431a0655ee2589a6faa29d3a11b1c8

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order_item")
<<<<<<< HEAD
public class OrderItem implements Serializable{

	private static final long serialVersionUID = 1L;

=======
public class OrderItem implements Serializable {

	private static final long serialVersionUID = 1L;
	
>>>>>>> ad8e4f4bf7431a0655ee2589a6faa29d3a11b1c8
	@EmbeddedId
	private OrderItemPK id = new OrderItemPK();
	
	private Integer quantity;
	private Double price;
	
	public OrderItem() {
	}
<<<<<<< HEAD
	public OrderItem(Order order, Product product, Integer quantity, Double price) {
=======

	public OrderItem(Order order, Product product, Integer quantity, Double price) {
		super();
>>>>>>> ad8e4f4bf7431a0655ee2589a6faa29d3a11b1c8
		id.setOrder(order);
		id.setProduct(product);
		this.quantity = quantity;
		this.price = price;
	}
<<<<<<< HEAD
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
=======
>>>>>>> ad8e4f4bf7431a0655ee2589a6faa29d3a11b1c8
	
	public Order getOrder() {
		return id.getOrder();
	}
<<<<<<< HEAD
	@JsonIgnore
=======
>>>>>>> ad8e4f4bf7431a0655ee2589a6faa29d3a11b1c8
	public void setOrder(Order order) {
		id.setOrder(order);
	}
	public Product getProduct() {
		return id.getProduct();
	}
	public void setProduct(Product product) {
		id.setProduct(product);
	}
<<<<<<< HEAD
	
=======

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

>>>>>>> ad8e4f4bf7431a0655ee2589a6faa29d3a11b1c8
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
<<<<<<< HEAD
=======

>>>>>>> ad8e4f4bf7431a0655ee2589a6faa29d3a11b1c8
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
