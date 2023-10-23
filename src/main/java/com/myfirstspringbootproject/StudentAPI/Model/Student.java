package com.myfirstspringbootproject.StudentAPI.Model;

public class Student {

    private String name;
    private String id;
    private int height;
    private int weight;
    private int aptitude;
    private String address;
    private int age;

    public Student(String name, String id, int height, int weight, int aptitude, String address, int age) {
        this.name = name;
        this.id = id;
        this.height = height;
        this.weight = weight;
        this.aptitude = aptitude;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAptitude() {
        return aptitude;
    }

    public void setAptitude(int aptitude) {
        this.aptitude = aptitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
