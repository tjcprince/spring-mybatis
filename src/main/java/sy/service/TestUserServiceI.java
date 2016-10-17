package sy.service;

import java.util.List;

import sy.module.TestUser;

public interface TestUserServiceI {

	TestUser getTestUserById(Integer id);

	List<TestUser> getAllTestUser();

	void insertTestUser(TestUser testUser);

}
