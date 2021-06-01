package com.itwill.shop.user;

public class UserService {
	private UserDao userDao;
	public UserService() {
		userDao=new UserDao();
	}
	
	/*
	 * 회원가입
	 */
	public int memberRegist(User user) throws Exception{
		int result=0;
		//아이디체크후
		if(userDao.duplicateIdCheck(user.getUserId())) {
			result=1;
		}else {
			userDao.insert(user);
			result=2;
		}
		return result;
	}
	
	/*
	 * 로그인
	 */
	public boolean login(String userId,String password) throws Exception{
		User findUser = userDao.selectOne(userId.trim());
		if(findUser!=null) {
			if(findUser.isMatchPassword(password)) {
				return true;
			}else {
				return false;
			}
			
		}else {
			return false;
		}
		
	}
}









