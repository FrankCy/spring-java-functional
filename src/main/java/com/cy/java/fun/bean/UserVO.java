package com.cy.java.fun.bean;

import java.io.Serializable;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: spring-java-functional
 * @package: com.cy.java.fun.bean、
 * @email: cy880708@163.com
 * @date: 2019/3/15 下午7:16
 * @mofified By:
 */
public class UserVO implements Serializable {

    private static final long serialVersionUID = -534592127030411484L;

    private String id;

    private String name;

    private String des;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public UserVO() {
    }

    public UserVO(String id, String name, String des) {
        this.id = id;
        this.name = name;
        this.des = des;
    }
}
