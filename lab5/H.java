package com.Alina;

public class H extends G{

  protected    String h = "H";
  private  X x = new X("*");

    public H(){

    }

    public H (String h, X x) {
        super("G", x);
        this.h = h;
    }

    public String toString() {

        return super.toString() + h;
    }
}
