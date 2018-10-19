package com.turchenkov.SecondLesson;

public class Singleton {

    private static Singleton instanse;

    private Singleton(int k){
        System.out.println("SINGLETON!");
        test(k);
    }

    public static Singleton getObject(int k){
        if (instanse == null){
            instanse = new Singleton(k);
        }
        return instanse;
    }

    private static void test(int k){
        System.out.println(k);
    }
}
