package com.fish.system;

public class Student {
    //私有化成员变量
    private int id;
    private String name;
    private int age;

    // 计数器：记录"曾经创建过多少个 Student 对象"（≠ 当前还有几个学生）
    // ① 为什么必须是 static：总数属于"类"，不属于某个对象。写成实例变量的话，
    //    每个对象各有一份、都从 0 开始 → 永远数不出总数。
    // ② 为什么删了学生它不减：count++ 只写在构造器里，记的是"构造器执行过几次"；
    //    删除只是把数组引用置空、对象被 GC 回收，构造器不会倒着再跑。
    // ③ 为什么重启就归零：static 随"类加载"创建、随"类卸载"销毁。它只在内存里、
    //    不落磁盘，所以不是持久化。（实测：加3个→count=3；删1个→size=2 但 count=3；重启→0）
    private static int count;

    //private static 方法校验
    private static String checkName(String name) {
        if (name == null) {
            throw new NullPointerException("名字不合法");
        }
        return name;
    }

    private static int checkId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("学号不合法");
        }
        return id;
    }

    private static int checkAge(int age) {
        if (age <= 0 || age > 120) {
            throw new IllegalArgumentException("年龄不合法");
        }
        return age;
    }


    //无参构造
    public Student() {
    }

    //全参构造
    public Student(int id, String name, int age) {
        this.id = checkId(id);
        this.name = checkName(name);
        this.age = checkAge(age);

        count++;
    }

    //get/set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = checkId(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = checkName(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = checkAge(age);
    }

    public static int getCount(){
        return count;
    }

    //重写toString
    @Override
    public String toString() {
        return "学号:" + id + "\t姓名:" + name + "\t年龄:" + age;
    }



}
