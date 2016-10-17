package sy.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import sy.module.TestUser;
import sy.service.TestUserServiceI;

//spring-test  junit测试
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring.xml", "classpath:spring/spring-mybatis.xml" })
public class TestMybatis {
	private static final Logger logger = Logger.getLogger(TestMybatis.class);

	// junit测试
	// @Test
	// public void test1() {
	// ApplicationContext ac=new ClassPathXmlApplicationContext(new
	// String[]{"spring.xml","spring-mybatis.xml"});
	// UserServiceI userService=(UserServiceI) ac.getBean("userService");
	// User u = userService.getUserById("1");
	// System.out.println(u.getName());
	// }

	/*
	 * //junit测试 ApplicationContext ac; UserServiceI userService;
	 * 
	 * @Before public void before(){
	 * 
	 * ac=new ClassPathXmlApplicationContext(new
	 * String[]{"spring.xml","spring-mybatis.xml"}); userService=(UserServiceI)
	 * ac.getBean("userService"); }
	 * 
	 * @Test public void test1() { User u = userService.getUserById("1");
	 * System.out.println(u.getName()); }
	 */
	@Autowired
	private TestUserServiceI testUserService;
//	/**
//	 * 插入
//	 * @throws ParseException
//	 */
//	@Test
//	public void test() throws ParseException {
//		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		TestUser u = new TestUser();
//		u.setUserId("xiaoming");
//		u.setUserName("小明");
//		u.setUserPassword("1111111");
//		u.setUserCreateTime(sdf.parse("2016-10-11 11:10:10"));
//		testUserService.insertTestUser(u);
//		;
//		logger.info(JSON.toJSONString(u));
//	}

	@Test
	public void test1() {
		TestUser u = testUserService.getTestUserById(Integer.valueOf(1));
		logger.info(JSON.toJSONString(u));
	}

	@Test
	public void test2() {
		List<TestUser> list = testUserService.getAllTestUser();
		logger.info(JSON.toJSONStringWithDateFormat(list, "yyyy-MM-dd HH:mm:ss"));
	}

}
