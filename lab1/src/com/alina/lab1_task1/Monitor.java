package com.alina.lab1_task1;

public class Monitor {
    Float dimension;
    Integer resolution;
    String color;

    public void setDimension(Float dimension) {
        this.dimension = dimension;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setResolution(Integer resolution) {
        this.resolution = resolution;
    }

    public void createMonitor(Float dimension, Integer resolution, String color) {
        this.dimension = dimension;
        this.resolution = resolution;
        this.color = color;
        System.out.println("\nThe monitor has been created\nThe new monitor:\n" +
                "Dimension:" + dimension + "\nResolution:" + resolution + "\nColor:" + color);

    }

   public void compareMonitor(Monitor monitor) {

        if (this.dimension.equals(monitor.dimension) && this.color.equals(monitor.color) && this.resolution.equals(monitor.resolution)) {
            System.out.println("\nThe monitors have the same parameters");
        } else {
            System.out.println("\nThe monitors don't have the same parameters");

        }

  }
}