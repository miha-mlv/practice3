package com.example.practice3;
import java.io.Serializable;
public class Student implements Serializable{
    private String surname, name, group, age;


    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public String getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
