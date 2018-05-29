package org.struts.action;

import com.opensymphony.xwork2.ActionSupport;

/** 
* @ClassName: LoginAction 
* @Description: 
* @author atlantis0617
* @date 2018年5月29日 下午5:44:48 
*  方式一：使用Action的属性接收参数
*/
public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 4054962975851919372L;

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String login() {

		System.out.println("username = " + username);
		System.out.println("password = " + password);
		return SUCCESS;

	}

}
