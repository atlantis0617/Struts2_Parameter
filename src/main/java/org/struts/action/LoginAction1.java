package org.struts.action;

import org.struts.model.User;

import com.opensymphony.xwork2.ActionSupport;

/** 
* @ClassName: LoginAction1 
* @Description: 
* @author atlantis0617
* @date 2018年5月29日 下午5:46:12 
*  方式二：使用Domain Model接收参数
*/
public class LoginAction1 extends ActionSupport {

	private static final long serialVersionUID = -7271269326237048618L;

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String login() {

		System.out.println("username = " + user.getUsername());
		System.out.println("password = " + user.getPassword());
		return SUCCESS;

	}

}
