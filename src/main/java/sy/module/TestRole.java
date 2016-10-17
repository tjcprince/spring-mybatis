package sy.module;

import java.io.Serializable;

public class TestRole implements Serializable {
    /** 角色id */
    private Integer id;

    /** 角色名 */
    private String roleName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    private TestRole(Builder b) {
        id = b.id;
        roleName = b.roleName;
    }

    public TestRole() {
        super();
    }

    public static class Builder {
        /** 角色id */
        private Integer id;

        /** 角色名 */
        private String roleName;

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder roleName(String roleName) {
            this.roleName = roleName;
            return this;
        }

        public TestRole build() {
            return new TestRole(this);
        }
    }
}