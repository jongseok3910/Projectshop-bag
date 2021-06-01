package com.itwill.shop.product;

public class ProductDaoTestMain {

	public static void main(String[] args) throws Exception{
		ProductDao productDao=new ProductDao();
		System.out.println("--------selectOne----------------");
		Product p1=productDao.selectOne(2);
		System.out.println(p1);
		Product p2=productDao.selectOne(1);
		System.out.println(p2);
		Product p3=productDao.selectOne(34);
		System.out.println(p3);
		
		System.out.println("-------selectMany-----------------");
		System.out.println(productDao.selectMany());

	}

}
