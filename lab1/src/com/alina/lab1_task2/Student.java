package com.alina.lab1_task2;

import java.util.Scanner;

public class Student {
        private String name;
        private  int age;
        private  float mark;

    Scanner scanner2 = new Scanner(System.in);

    public String getName(){
        return this.name;
    }

    public float getMark(){
        return this.mark;
    }

    public void createS (){
          System.out.println("Enter the name");
          this.name = scanner2.nextLine();
          System.out.println("Enter the age");
          this.age = scanner2.nextInt();
          System.out.println("Enter the mark");
          this.mark = scanner2.nextFloat();
      }

    public void showS (){
          System.out.println("Name: " + this.name + "\nAge: " + this.age + "\nMark: " + this.mark);
      }



}