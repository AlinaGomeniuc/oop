package com.Alina;

public class D extends  C{

   protected String d = "D";
   public X x = new X("Z");

    public D(){

    }

    public D (String d , X x) {
        super("C", x);
        this.d = d;
    }

    public String toString() {
        return  super.toString() + d;
    }
}
