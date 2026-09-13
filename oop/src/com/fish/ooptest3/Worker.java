package com.fish.ooptest3;

public class Worker {
     private String name;
     private int age;
     private int workedHours;



     public Worker(String name, int age, int workedHours){
          this.name = name;
          this.age = age;
          this.workedHours = workedHours;
     }
     public void work(){

          System.out.println(age + "岁的工人正在工作");
     }

     public void setName(String value){
          name = value;
     }

     public String getName(){
          return name;
     }

     public void setAge(int num){
          if(num >= 0 && num <= 100) {
               age = num;
          }else{
              System.out.println("当前的" + num + "不在合理范围内");
          }
     }

     public int getAge(){
          return age;
     }

     public void setWorkedHours(int num){
          if(num >= 0 && num <= 100) {
               workedHours = num;
          }else{
               System.out.println("当前的" + num + "不在合理范围内");
          }
     }

     public int getWorkedHours(){
          return workedHours;
     }

}

