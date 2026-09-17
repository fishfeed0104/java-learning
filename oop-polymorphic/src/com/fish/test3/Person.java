package com.fish.test3;

public class Person {
    //属性
    private String name;
    private int age;

    //构造方法
    public Person() {
    }
    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }
    //方法
    public void keepPet(Pet pet, String something){
        pet.eat(something);

        //调用子类的特有功能
        if(pet instanceof Dog){
            Dog dog = (Dog) pet;
            dog.lookHome();
        } else if(pet instanceof Cat){
            Cat cat = (Cat) pet;
            cat.catchMouse();
        }else{
            System.out.println("未知的动物");
        }
    }
    //getter/setter方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
