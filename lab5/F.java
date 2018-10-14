package com.Alina;

public class F extends E{

  protected    String f = "F";

    public F(){

    }

    public F (String f , X x) {
        super("E", x);
        this.f = f;
    }

    public String toString() {

        return super.toString() + f;
    }
}
