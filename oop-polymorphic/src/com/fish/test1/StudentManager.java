package com.fish.test1;

public class StudentManager {
    public void register(Person person) {
        System.out.println("姓名为" + person.getName() + "的同学注册成功，账号" + person.getAccount() + "，密码" + person.getPassword());
        person.work();
    }
}
