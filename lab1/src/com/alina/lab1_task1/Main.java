package com.alina.lab1_task1;

public class Main {

    public static void main(String[] args) {
        Monitor monitor1 = new Monitor();
        monitor1.createMonitor( 15f, 1024, "gray");
        Monitor monitor2 = new Monitor();
        monitor2.createMonitor(17f, 1024, "black");
        monitor1.compareMonitor(monitor2);
        monitor1.setColor("red");
        System.out.println("\nThe first monitor after update:\n"  +
                "Dimension:" + monitor1.dimension + "\nResolution:"+ monitor1.resolution + "\nColor:" + monitor1.color);
    }
}
