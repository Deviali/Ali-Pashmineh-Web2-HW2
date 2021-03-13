package com.dao;

import com.model.UserBean;

public interface UserDao {
	
	public void userRegister(UserBean userBean);
	public boolean login(UserBean userBean);
	

}
