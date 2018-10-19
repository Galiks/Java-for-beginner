package com.turchenkov.FirstLesson;

public class A implements Testing{

    static int i = 1;
    static int j = i;

    public A() {

    }

    static {
        System.out.println("Static A " + i);
        System.out.println("Static A " + j);
    }

    @Override
    public void test(int x) {
        System.out.println(x);
    }

    public class B {

        public B() {
            System.out.println("Ctor B " + i);
        }
    }
}

class C extends A{

    public C() {
        super();
        test(XY*XY);
    }

    static {
        int i = 1;
        System.out.println("Static B " + i++);
        System.out.println("Static B " + ++i);
    }
}

interface Testing{
    int XY = 5;
    void test(int x);
}

