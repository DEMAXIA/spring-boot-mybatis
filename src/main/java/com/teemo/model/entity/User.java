package com.teemo.model.entity;

import org.springframework.stereotype.Component;

/**
 * Created by Anni on 2016/10/25.
 */

@Component
public class User {

    private int id;

    private String name;

    private String age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
