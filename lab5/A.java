package com.Alina;

public class A {

   protected String a = "A" ;
   public X x = new X ("Y");

   public A (){


   }

    public  A( String a, X x) {

        this.a = a;
        this.x = x;
    }


    public String toString(){
       return a + x.getX() ;

    }
}

