/*******************************************************************************
 * Project Key : CPPII
 * Create on 2016年9月18日 下午2:12:52
 * Copyright (c) 2008 - 2011.深圳市齐采科技有限公司版权所有. 粤ICP备16034195号
 * 注意：本内容仅限于深圳市齐采科技服务有限公司内部传阅，禁止外泄以及用于其他的商业目的
 ******************************************************************************/
package demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.model.User;
import demo.service.UserService;

/**
 * <P>TODO</P>
 * @version 1.0
 * @author 王保旬（15996226054）  2016年9月18日 下午2:12:52
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/detail")
	public String detailUser(HttpServletRequest request, Model model) {
		long id = Long.parseLong(request.getParameter("id"));
		Long time1 = System.currentTimeMillis();
		User user = userService.getUser(id);
		Long time2 = System.currentTimeMillis();
		System.out.println("查询时间：" + (time2 - time1));
		model.addAttribute("user", user);
		return "user_detail";
	}
	
	@RequestMapping("/insert_user")
	public String insertUser(HttpServletRequest request, User user, Model model) {
		int num = userService.insertUser(user);
		model.addAttribute("user", user);
		model.addAttribute("num", num);
		return "user_detail";
	}
	
	@RequestMapping("/delete_user")
	public String deleteUser(HttpServletRequest request,long id, Model model) {
		User user = userService.getUser(id);
		int num = userService.deleteUser(id);
		model.addAttribute("user", user);
		model.addAttribute("num", num);
		return "user_detail";
	}
	
	@RequestMapping("/update_user")
	public String updateUser(HttpServletRequest request, User user, Model model) {
		int num = userService.updateUser(user);
		/*User usernew = userService.getUser(user.getUserId());
		model.addAttribute("user", usernew);*/
		model.addAttribute("num", num);
		return "user_detail";
	}
}

