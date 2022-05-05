package com.lushannanlu.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class User {
    @Value("limingji")
    private String name;


    @Autowired
    @Qualifier("dog")
    private Dog dog;

    @Value("篮球")
    private List<String> hobby;

    public User(){}


    public User(String name, Dog dog,List<String> hobby) {
        this.name = name;
        this.dog = dog;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                ", hobby=" + hobby +
                '}';
    }
}
