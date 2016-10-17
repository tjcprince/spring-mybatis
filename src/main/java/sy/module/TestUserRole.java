package sy.module;

import java.io.Serializable;

public class TestUserRole implements Serializable {
    /** 用户角色表id */
    private Integer id;

    /** 用户id */
    private Integer userid;

    /** 角色id */
    private Integer roleid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    private TestUserRole(Builder b) {
        id = b.id;
        userid = b.userid;
        roleid = b.roleid;
    }

    public TestUserRole() {
        super();
    }

    public static class Builder {
        /** 用户角色表id */
        private Integer id;

        /** 用户id */
        private Integer userid;

        /** 角色id */
        private Integer roleid;

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder userid(Integer userid) {
            this.userid = userid;
            return this;
        }

        public Builder roleid(Integer roleid) {
            this.roleid = roleid;
            return this;
        }

        public TestUserRole build() {
            return new TestUserRole(this);
        }
    }
}