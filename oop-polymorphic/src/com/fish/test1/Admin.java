package com.fish.test1;

public class Admin extends Person {
    public Admin() {
    }
    public Admin(String name, String account, String password) {
        super(name, account, password);
    }
    //方法
    @Override
    public void work() {
        System.out.println("管理员的工作是管理网站");
    }
}
