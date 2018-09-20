package com.alina.lab2_task1;

public class Main {

    public static void main(String[] args) {

        Box box1 = new Box();
        box1.setInaltime(4.3);
        box1.setLatime(5);
        box1.setLungime(2.6);
        System.out.println("The parameters of first box:");
        System.out.println("The length: " + box1.getLungime());
        System.out.println("The height: " + box1.getInaltime());
        System.out.println("The width: " + box1.getLatime());

        Box box2 = new Box(2.2);
        System.out.println("The parameters of second box:");
        System.out.println("The length: " + box2.getLungime());
        System.out.println("The height: " + box2.getInaltime());
        System.out.println("The width: " + box2.getLatime());

        Box box3 = new Box(2, 4, 3.2);
        System.out.println("The parameters of third box:");
        System.out.println("The length: " + box3.getLungime());
        System.out.println("The height: " + box3.getInaltime());
        System.out.println("The width: " + box3.getLatime());

        System.out.println("Get the Area:");
        System.out.println("First box: " + box1.getArea());
        System.out.println("Second box: " + box2.getArea());
        System.out.println("Third box: " + box3.getArea());

        System.out.println("Get the Volume:");
        System.out.println("First box: " + box1.getVolume());
        System.out.println("Second box: " + box2.getVolume());
        System.out.println("Third box: " + box3.getVolume());






    }
}
