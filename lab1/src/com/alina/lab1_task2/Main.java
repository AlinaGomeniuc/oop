package com.alina.lab1_task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int i;

        Scanner scanner = new Scanner(System.in);

        System.out.println("The number of needed students:");
        int nrS = scanner.nextInt();
        Student student[] = new Student[nrS];
        for(i = 0; i < nrS; i++){
            student[i] = new Student();
            System.out.println("Enter the info about student nr." + (i+1));

            student[i].createS();

        }

        Univer univers[] = new Univer[3];
//        for(i = 0; i < 3; i++){
//            univers[i] = new Univer();
//            System.out.println("Enter the info about university nr." + (i+1));
//
//            univers[i].createU();
//        }
        int k = 1;
        for (Univer univer:univers) {
            univer = new Univer();
            univer.createU();
            System.out.println(k);
            k++;
        }

        boolean isRunning = true;
        while (isRunning) {

            System.out.println("\t\tMenu:");
            System.out.println("Select the wanted option:");
            System.out.println("1.Show the students");
            System.out.println("2.Show the universities");
            System.out.println("3.Add the students to universities");
            System.out.println("4.The average media of first university");
            System.out.println("5.The average media of second university");
            System.out.println("6.The average media of third university");
            System.out.println("7.The average media of all universities");
            System.out.println("0.Exit");


            int option = scanner.nextInt();

            switch (option) {

                case 1:
                    System.out.println("\nThe students:");
                    for(i = 0; i < nrS; i++){
                        System.out.println("\nStudent nr." + (i+1));
                        student[i].showS();
                    }
                    break;

                case 2:
                    System.out.println("\nThe universities:");
                    for(i = 0; i < 3; i++){
                        System.out.println("\nUniversity nr." + (i+1));
                        univers[i].showU();
                    }
                    break;

                case 3:

                    System.out.println("Add students to universities:");
                    for(i = 0; i < nrS; i++) {
                        System.out.println("Choose the nr. of student");
                        int optionS = scanner.nextInt();
                        while (optionS > student.length) {
                            System.out.println("Choose the nr. of student");
                            optionS = scanner.nextInt();
                        }
                        System.out.println("Choose the nr. of university");
                        int optionU = scanner.nextInt();
                        while (optionU > univers.length) {
                            System.out.println("Choose the nr. of university");
                            optionU = scanner.nextInt();
                        }
                        univers[optionU - 1].addS(student[optionS - 1]);
                    }

                    System.out.println("\nThe universities:");
                    for(i = 0; i < 3; i++){
                        System.out.println("\nUniversity nr." + (i+1));
                        univers[i].showU();
                    }
                    break;

                case 4:
                    System.out.println("The average of first university is:");
                    System.out.println(univers[0].getAverage());
                    break;

                case 5:
                    System.out.println("The average of second university is:");
                    System.out.println(univers[1].getAverage());
                    break;

                case 6:
                    System.out.println("The average of third university is:");
                    System.out.println(univers[2].getAverage());
                    break;

                case 7:
                    float result;
                    System.out.println("The average of all students is:");
                    result = (univers[0].getAverage() + univers[1].getAverage() + univers[2].getAverage())/3;
                    System.out.println(result);
                    break;

                case 0:
                    isRunning = false;



            }
        }
    }
}