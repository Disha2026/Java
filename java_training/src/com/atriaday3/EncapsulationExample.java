package com.atriaday3;

public class EncapsulationExample {
    private int serialNum;
    private String name;
    private int age;

    // Getter and Setter for serialNum
    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "EncapsulationExample [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
    }
}

