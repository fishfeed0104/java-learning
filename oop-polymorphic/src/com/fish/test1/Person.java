package com.fish.test1;

public class Person {
    //属性
    private String name;
    private String account;
    private String password;

    //构造方法
    public Person() {
    }
    public Person(String name, String account, String password) {
        this.name = name;
        this.account = account;
        this.password = password;
    }

    //方法
    public void work() {
        System.out.println("人的工作是工作");
    }

    //getter和setter方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
