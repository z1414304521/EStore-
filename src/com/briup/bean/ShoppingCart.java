package com.briup.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<Product,Integer> cart = 
		new HashMap<Product,Integer>();
	
	//向购物车添加商品
	public void add(Product p){
		if(cart.get(p)==null){
			cart.put(p,1);
		}else {
			Integer num = cart.get(p);
			num++;
			cart.put(p,num);
		}
	}
	//删除购物车商品
	public void remove(Product p){
		cart.remove(p);
	}
	
	//清空购物车
	public void clear(){
		cart.clear();
	}
	//修改购物车中的商品数量
	public void changeNum(Product p,int num){
		
		//购物车中没有这个商品
		if(!cart.containsKey(p)){
			return;
		}
		cart.put(p,num);
	}
	
	//获得当前购物车中所有商品的总价钱
	public double getCost(){
		double cost = 0;
		for(Product p:cart.keySet()){
			Integer num = cart.get(p);
			Double price = p.getPrice();
			
			//cost = cost+num*baseprice;
			cost+=num*price;
		}
		return cost;
	}
	public Map<Product, Integer> getCart() {
		return cart;
	}
	public void setCart(Map<Product, Integer> cart) {
		this.cart = cart;
	}
}
