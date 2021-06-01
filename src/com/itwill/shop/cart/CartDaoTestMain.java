package com.itwill.shop.cart;

public class CartDaoTestMain {

	public static void main(String[] args) throws Exception{
		CartDao cartDao=new CartDao();
		System.out.println(cartDao.cartList("guard1"));

	}

}
