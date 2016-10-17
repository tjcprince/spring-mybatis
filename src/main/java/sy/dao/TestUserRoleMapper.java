package sy.dao;

import java.util.List;

import sy.module.TestUserRole;

public interface TestUserRoleMapper {
    public static final String DATA_SOURCE_NAME = "null";

    int deleteByPrimaryKey(Integer id);

    int insert(TestUserRole record);

    int insertSelective(TestUserRole record);

    TestUserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestUserRole record);

    int updateByPrimaryKey(TestUserRole record);

    int insertBatch(List<TestUserRole> records);
}