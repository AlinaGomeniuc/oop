package com.Alina;

public class Main {

    public static void main(String[] args) {

       X x1 = new X("X");

        A a = new A("A" , x1);
        System.out.println(a.toString());

        B b = new B("B" , x1);
        System.out.println(b.toString());

        C c = new C("C", x1);
        System.out.println(c.toString());

        D d = new D("D",x1);
        System.out.println(d.toString());

        E e = new E("E",x1);
        System.out.println(e.toString());

        F f = new F("F",x1);
        System.out.println(f.toString());

        G g = new G("G",x1);
        System.out.println(g.toString());

        H h = new H("H",x1);
        System.out.println(h.toString());

        I i = new I("I", x1);
        System.out.println(i.toString());

        J j = new J("J", x1);
        System.out.println(j.toString());


    }
}
