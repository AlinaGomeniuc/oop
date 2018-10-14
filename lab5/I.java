package com.Alina;

public class I extends H{

   protected String i = "I";

    public I(){

    }

    public I (String i , X x) {
        super("H", x);
        this.i = i;
    }

    public String toString() {

        return super.toString() + i;
    }
}
