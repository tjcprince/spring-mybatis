package sy.dao;

import java.util.List;

import sy.module.TestRole;

public interface TestRoleMapper {
    public static final String DATA_SOURCE_NAME = "null";

    int deleteByPrimaryKey(Integer id);

    int insert(TestRole record);

    int insertSelective(TestRole record);

    TestRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestRole record);

    int updateByPrimaryKey(TestRole record);

    int insertBatch(List<TestRole> records);
}