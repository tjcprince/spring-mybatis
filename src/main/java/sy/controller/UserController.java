package sy.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import sy.jdbc.UserJdbc;
import sy.module.TestUser;
import sy.module.TestXmlModule;
import sy.service.TestUserServiceI;

@Controller
@RequestMapping("/userController")
public class UserController {
	private static final Logger logger = Logger.getLogger(UserController.class);

	@Resource
	private UserJdbc UserJdbc;// jdbc
	@Autowired
	private TestUserServiceI testUserService;

	// http://localhost:8080/testmybatis/userController/showUser1.do?id=1
	@RequestMapping("/showUser1")
	public String showUser1(String id, HttpServletRequest request) {
		TestUser u = testUserService.getTestUserById(Integer.valueOf(id));
		request.setAttribute("user", u);
		System.out.println("------" + id + "-----");
		return "showUser";
	}

	// http://localhost:8080/testmybatis/userController/showUser/1,2.do
	@RequestMapping("/showUser/{id},{name}")
	public String showUser(@PathVariable String id, @PathVariable String name, HttpServletRequest request) {
		TestUser u = testUserService.getTestUserById(Integer.valueOf(id));
		request.setAttribute("user", u);
		logger.info(JSON.toJSONString(u));
		return "showUser";
	}

	/**
	 * 返回xml json数据
	 * 
	 * @param id
	 * @param request
	 * @return
	 */
	// http://localhost:8080/SpringMVC-angular/userController/showUser2.json?id=1
	// http://localhost:8080/SpringMVC-angular/userController/showUser2.xml?id=1
	// http://localhost:8080/SpringMVC-angular/userController/showUser2.do?id=1
	@RequestMapping(value = { "showUser2" }, method = RequestMethod.GET)
	public ModelAndView showUser2(String id, HttpServletRequest request) {
		// 返回xml
		// http://stackoverflow.com/questions/15273393/javax-servlet-servletexception-unable-to-locate-object-to-be-marshalled-in-mode
		ModelAndView mav = new ModelAndView();
		TestUser u = testUserService.getTestUserById(Integer.valueOf(id));
		TestXmlModule xmlModle = new TestXmlModule();
		xmlModle.setId(u.getUserId());
		xmlModle.setName(u.getUserName());
		mav.addObject("xmlModle", xmlModle);
		logger.info(mav.toString());
		return mav;
	}

	/**
	 * 分页插件使用
	 * 
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("/page")
	public ModelAndView page(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("page");

		PageHelper.startPage(1, 4);
		List<TestUser> list = testUserService.getAllTestUser();
		// 用PageInfo对结果进行包装
		PageInfo page = new PageInfo(list);
		// 测试PageInfo全部属性
		// PageInfo包含了非常全面的分页属性
		System.out.println(page.getPageNum());// 当前是第几页
		System.out.println(page.getPageSize());// 每页条数
		System.out.println(page.getStartRow());// 开始行
		System.out.println(page.getEndRow());// 结束行
		System.out.println(page.getTotal());// 总数
		System.out.println(page.getPages());// 一共多少页
		System.out.println(page.getFirstPage());// 第一页
		System.out.println(page.getLastPage());// 最后一页
		System.out.println(page.isIsFirstPage());// 是否是第一页
		System.out.println(page.isIsLastPage());// 是否是最后一页
		System.out.println(page.isHasPreviousPage());// 是否有上一页
		System.out.println(page.isHasNextPage());// 是否有下一页
		for (int i = 0; i < list.size(); i++) {
			TestUser u = (TestUser) list.get(i);
			System.out.println(u.getUserName());
		}
		mav.addObject("list", list);
		mav.addObject("page", page);
		return mav;
	}
}
