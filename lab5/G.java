package com.Alina;

public class G extends F{

   protected String g = "G";

    public G(){

    }

    public G (String g , X x) {
        super("F", x);
        this.g = g;
    }

    public String toString() {
        return super.toString() +g;
    }
}
