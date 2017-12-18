package com.xtwy.bean;

public class Roles {
    private Integer rolesid;

    private String rolesnamezh;

    private String rolesnameen;

    private String remark;

    public Integer getRolesid() {
        return rolesid;
    }

    public void setRolesid(Integer rolesid) {
        this.rolesid = rolesid;
    }

    public String getRolesnamezh() {
        return rolesnamezh;
    }

    public void setRolesnamezh(String rolesnamezh) {
        this.rolesnamezh = rolesnamezh == null ? null : rolesnamezh.trim();
    }

    public String getRolesnameen() {
        return rolesnameen;
    }

    public void setRolesnameen(String rolesnameen) {
        this.rolesnameen = rolesnameen == null ? null : rolesnameen.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}