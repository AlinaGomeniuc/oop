package com.Alina;

public class J extends I{

   protected String j = "J";

    public J(){

    }

    public J (String j, X x) {
        super("I", x);
        this.j = j;
    }

    public String toString() {

        return super.toString() + j;
    }
}
