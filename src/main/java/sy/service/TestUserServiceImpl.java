package sy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sy.dao.TestUserMapper;
import sy.module.TestUser;

@Service("testUserService")
public class TestUserServiceImpl implements TestUserServiceI {

	private TestUserMapper testUserMapper;

	public TestUserMapper getUserMapper() {
		return testUserMapper;
	}

	@Autowired
	public void setUserMapper(TestUserMapper userMapper) {
		this.testUserMapper = userMapper;
	}
	
	@Override
	public void insertTestUser(TestUser testUser) {
		 testUserMapper.insertSelective(testUser);
	}
	@Override
	public TestUser getTestUserById(Integer id) {
		return testUserMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<TestUser> getAllTestUser() {
		return testUserMapper.getAllTestUser();
	}
}
