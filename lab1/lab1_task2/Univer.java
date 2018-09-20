package com.alina.lab1_task2;

import java.util.Scanner;

public class Univer {
    private String name;
    private int year;
    private Student[] student = new Student[50];
    private int nrOfStudents;


    Scanner scanner3 = new Scanner(System.in);

    public void createU() {
        System.out.println("Enter the name");
        this.name = scanner3.nextLine();
        System.out.println("Enter the year of foundation");
        this.year = scanner3.nextInt();
    }


    public void showU() {
        int i;

        System.out.println("Name: " + this.name + "\nYear of foundation: " + this.year);
        System.out.println("The nr. of students in this university:" + this.nrOfStudents);
        if (student[0] != null) {
            System.out.println("The list of students:");
            for (i = 0; i < nrOfStudents; i++) {
                System.out.println(student[i].getName());
            }
        }
    }

    public void addS(Student student) {

        this.student[nrOfStudents] = student;
        nrOfStudents++;

    }

    public float getAverage() {
        int i = 0;
        float Sum = 0;

        for (i = 0; i < nrOfStudents; i++) {
            Sum = Sum + student[i].getMark();
        }

        if (Sum == 0) {
            return 0;
        }

        return Sum / nrOfStudents;
    }
}
