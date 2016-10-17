package sy.dao;

import java.util.List;

import sy.module.TestUser;

public interface TestUserMapper {
    public static final String DATA_SOURCE_NAME = "null";

    int deleteByPrimaryKey(Integer id);

    int insert(TestUser record);

    int insertSelective(TestUser record);

    TestUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestUser record);

    int updateByPrimaryKey(TestUser record);

    int insertBatch(List<TestUser> records);
    
    List<TestUser> getAllTestUser();
}