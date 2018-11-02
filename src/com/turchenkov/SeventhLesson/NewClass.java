package com.turchenkov.SeventhLesson;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class NewClass {
    public static void main(String[] args) throws Throwable {
        Count count1 = new Count(1);
        Count count2 = new Count(1);
        Count count3 = new Count(3);

        

//        String n1 = "10";
//        String n2 = "10";
//
//        System.out.println(count1.hashCode() + " : " + count2.hashCode());

//        Count[] array = new Count[3];
//
//        array[0] = count1;
//        array[1] = count2;
//        array[2] = count3;
//
//        System.out.println(Arrays.toString(array));
//
//        System.out.println("Equals: " + count1.equals(count2));
//
//        System.out.println(array + " : " + array.hashCode());
//
//        for (Count i: array) {
//            System.out.println(i.toString());
//        }


//        System.out.println("result: " + count.toString());
//
//        System.out.println(count.hashCode());

    }
}

class Count implements Cloneable{

    public int number;
    public float number2;

    public long number3;

    public Count(int number) {
        this.number = number;
    }

    public Count() {

    }

    @Override
    public int hashCode() {
        return number;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Count count = (Count) o;
        return number == count.number &&
                Float.compare(count.number2, number2) == 0;
    }

    @Override
    public Count clone(){
        return new Count(number);
    }

    @Override
    public String toString() {
        return "Count{" +
                "number=" + number +
                ", number2=" + number2 +
                ", number3=" + number3 +
                '}';
    }
}