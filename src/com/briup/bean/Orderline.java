package com.briup.bean;
//订单明细
public class Orderline {
	private Long id;//id
	private Integer num;//数量
	private Orderform orderform;//订单信息	id  价格  时间  顾客
	private Product product;// book
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public Orderform getOrderform() {
		return orderform;
	}
	public void setOrderform(Orderform orderform) {
		this.orderform = orderform;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
}
