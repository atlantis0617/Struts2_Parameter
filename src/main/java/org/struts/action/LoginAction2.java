package org.struts.action;

import org.struts.model.User;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @ClassName: LoginAction2
 * @Description:
 * @author atlantis0617
 * @date 2018年5月29日 下午5:46:53 方式三：使用ModelDriven接收参数
 */
public class LoginAction2 extends ActionSupport implements ModelDriven<User> {

	private static final long serialVersionUID = -3056712746595424765L;

	private User user = new User();

	@Override
	public User getModel() {

		return user;

	}

	public String login() {

		System.out.println("username = " + user.getUsername());
		System.out.println("password = " + user.getPassword());
		return SUCCESS;

	}

}
