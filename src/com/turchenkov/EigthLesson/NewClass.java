package com.turchenkov.EigthLesson;

import java.util.*;

public class NewClass implements Comparator {

    public static void main(String[] args) {
//        Map<Integer,String> map = new HashMap<>();
//
//        for (Integer i = 1; i < 6; i++){
//            map.put(i, "s"+i.toString());
//        }
//
//        map.put(999999, "s6");
//        map.putIfAbsent(5,"new");
//        map.put(999998, "s7");

//        Iterator i = map.entrySet().iterator();
//
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }

//        Storage<Double> storage = new Storage<>();
//
//        storage.setObj(123.);
//
//        System.out.println(storage.getObj());

        Fruit[] fruits = new Apple[10];
        fruits[0] = new GreenApple();
        fruits[1] = new GranyApple();
        fruits[2] = new Apple();
        fruits[3] = new Orange();
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}

class Storage <T extends Number>{
    T obj;

    public T getObj(){
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}