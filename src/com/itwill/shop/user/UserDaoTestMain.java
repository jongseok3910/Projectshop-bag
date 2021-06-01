package com.itwill.shop.user;

public class UserDaoTestMain {

	public static void main(String[] args) throws Exception{
		UserDao userDao=new UserDao();
		System.out.println(userDao.selectOne("ddd"));
		//userDao.insert(new User("uuuu","uuuu","유유유유","유메일"));
		//userDao.insert("vvvv","vvvv","부이부이","부이메일");
		userDao.selectOne("xxxx");
		//userDao.update("guard11","8989","가드원수정","xchange@co.kr");
		userDao.update(new User("uuuu","uuuu","ㅠㅠㅠㅠ","ㅠㅠ@co.kr"));
		userDao.selectOne("guard11");
		userDao.delete("guard11");
		
		
	}

}
