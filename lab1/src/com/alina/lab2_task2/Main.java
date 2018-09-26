package com.alina.lab2_task2;


public class Main {

    public static void main(String[] args) {
        int first;

//        Queue queue1 = new Queue();
//        queue1.setNrOfElements(5);
//        queue1.addElement(1);
//        queue1.addElement(5);
//        queue1.addElement(11);
//        queue1.addElement(1);
//        queue1.addElement(9);
//        queue1.addElement(8);
//        queue1.show();

        Queue queue2 = new Queue(4);
        queue2.addElement(9);
        queue2.addElement(6);
        queue2.show();
//        queue1.deleteElement();
//        queue1.show();
        queue2.deleteElement();
        queue2.show();
        queue2.addElement(5);
        queue2.addElement(1);
        queue2.show();
        queue2.addElement(2);
        queue2.show();
        first =queue2.deleteElement();
        System.out.println("The deleted element is: " + first );
        queue2.show();

    }
}
