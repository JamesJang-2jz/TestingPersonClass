package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name = "";
    private int age = Integer.MAX_VALUE;

    private String hobby = "";

    private String job = "";

    private String height = "";

    private double shoeSize = 0;
    private int areaCode;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public String getHobby() {
        return hobby;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJob() {
        System.out.println(job);
        return job;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHeight() {
        return height;
    }

    public void setShoeSize(double shoeSize) {
        this.shoeSize = shoeSize;
    }

    public double getShoeSize() {
        return shoeSize;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public int getAreaCode() {
        return areaCode;
    }
}
