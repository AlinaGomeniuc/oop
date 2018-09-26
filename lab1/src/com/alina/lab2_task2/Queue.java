package com.alina.lab2_task2;



public class Queue {
    private int nrOfElements;
    private int[] list;
    private int capacity = 0;



    public Queue (){

    }

    public Queue (int nr){
        this.nrOfElements = nr;
        list = new int[nr];

    }

    public void setNrOfElements(int nrOfElements) {
        this.nrOfElements = nrOfElements;
        list = new int[nrOfElements];
    }

    public int getNrOfElements() {
        return nrOfElements;
    }

    public boolean isFull(){
        return this.capacity == nrOfElements;

    }

    public boolean isEmpty(){
        return this.capacity == 0;

    }

    public void show (){
        System.out.println("The new queue is:");
        for (int i = 0; i < nrOfElements; i++){
            System.out.println(this.list[i]);

        }
    }

    public void addElement (int element){
        if(this.isFull()){
            int[] newList = new int[nrOfElements + 1];
            System.arraycopy(list, 0, newList, 0, nrOfElements );
            nrOfElements++;
            newList[capacity] = element;
            list = newList;
        }
        else {
            if(capacity == 0){
                this.list[0] = element;
            }
            else {
                this.list[capacity] = element;
                }

            }
            capacity++;

        }

    public int deleteElement (){
        if (this.isEmpty()){
            System.out.println("The queue does not have any elements");
        }
        int first = list[0];
        int [] newlist = new int[nrOfElements -1];
        nrOfElements--;
        capacity--;
        System.arraycopy(list, 1, newlist, 0,nrOfElements);
        list = newlist;
        return first;
    }
    }

