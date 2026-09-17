package com.fish.test1;

public class Test {
    public static void main(String[] args) {
        /*
        学生类：
        属性：姓名，账号，密码
        行为：work：学生的工作是学习
        老师类：
        属性：姓名，账号，密码
        行为：work：老师的工作是教学
        管理员：
        属性：姓名，账号，密码
        行为：work：管理员的工作是管理网站
        学生管理系统：
        行为：注册register
        要求:能注册所有的角色
        输出：姓名为张三的同学注册成功，账号zhangsan，密码123456
         */

        //创建对象
        Student student = new Student("张三", "zhangsan", "123456");
        Teacher teacher = new Teacher("李四", "lisi", "123456");
        Admin admin = new Admin("王五", "wangwu", "123456");

        //注册
        StudentManager s = new StudentManager();
        s.register(student);
        s.register(teacher);
        s.register(admin);
    }
}
