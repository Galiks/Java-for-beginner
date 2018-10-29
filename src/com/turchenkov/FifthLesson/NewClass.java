package com.turchenkov.FifthLesson;
import java.util.*;

public class NewClass {

    public static void main(String[] args) {
        String temp = "Where?wert";
        StringBuffer temp2 = new StringBuffer("q");
        StringBuilder temp3 = new StringBuilder("qqqqq");
        System.out.println(temp.length());

        System.out.println(temp2.length());
        System.out.println(temp2.capacity());

        System.out.println(temp3.length());
        System.out.println(temp3.capacity());

        for (String item:temp.split("[?]")) {
            System.out.println(item);
        }

        StringTokenizer stringTokenizer = new StringTokenizer("Where?where?", "?");

        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
