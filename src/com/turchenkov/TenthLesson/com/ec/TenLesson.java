package com.turchenkov.TenthLesson.com.ec;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TenLesson {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Root root = new Root();
        Child child = new Child();

        Constructor cloneRoot = root.getClass().getConstructor();

        Object o = cloneRoot.newInstance();

        Object[] argss = {"My age: ", 20};

        Method m = o.getClass().getDeclaredMethods()[5];

        System.out.println(m.toString());


        System.out.println(m.invoke(o, argss));

    }
}
