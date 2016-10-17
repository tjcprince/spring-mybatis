package sy.module;

import java.io.Serializable;
import java.util.Date;

public class TestUser implements Serializable {
    /** 用户id */
    private Integer id;

    /** 用户名 */
    private String userName;

    /** 用户id */
    private String userId;

    /** 密码 */
    private String userPassword;

    /** 用户创建时间 */
    private Date userCreateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Date getUserCreateTime() {
        return userCreateTime;
    }

    public void setUserCreateTime(Date userCreateTime) {
        this.userCreateTime = userCreateTime;
    }

    private TestUser(Builder b) {
        id = b.id;
        userName = b.userName;
        userId = b.userId;
        userPassword = b.userPassword;
        userCreateTime = b.userCreateTime;
    }

    public TestUser() {
        super();
    }

    public static class Builder {
        /** 用户id */
        private Integer id;

        /** 用户名 */
        private String userName;

        /** 用户id */
        private String userId;

        /** 密码 */
        private String userPassword;

        /** 用户创建时间 */
        private Date userCreateTime;

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder userPassword(String userPassword) {
            this.userPassword = userPassword;
            return this;
        }

        public Builder userCreateTime(Date userCreateTime) {
            this.userCreateTime = userCreateTime;
            return this;
        }

        public TestUser build() {
            return new TestUser(this);
        }
    }
}