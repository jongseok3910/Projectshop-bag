package com.itwill.shop.cart;

import java.util.List;

public class CartService {
	private CartDao cartDao;
	public CartService() {
		cartDao=new CartDao();
	}
	/*
	 * 추가 or 수정
	 */
	public int add(String sUserId,int p_no,int cart_qty ) throws Exception{
		
		boolean existProduct = cartDao.isProductExist(sUserId,p_no);
		if(existProduct) {
			return cartDao.update(sUserId, p_no, cart_qty);
		}else {
			return cartDao.add(sUserId, p_no, cart_qty);
		}
		
		
	}
	
	public List<Cart> cartList(String sUserId) throws Exception{
		return cartDao.cartList(sUserId);
	}
	/*
	 * cart 한개아이템삭제
	 */
	public int deleteCartByNo(int cart_no) throws Exception{
		return cartDao.deleteCartByNo(cart_no);
	}
	/*
	 * cart 전체아이템삭제
	 */
	public int deleteCart(String  sUserId) throws Exception{
		return cartDao.deleteCart(sUserId);
	}
	
}
