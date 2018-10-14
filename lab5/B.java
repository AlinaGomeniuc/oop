package com.Alina;

public class B extends A{

   protected String b = "B" ;

   public B (){

   }

   public B (String b , X x  ) {
       //super("A");
       super("A",x);
       this.b = b;


   }

    public String toString() {
        return super.toString() + b;
    }
}
