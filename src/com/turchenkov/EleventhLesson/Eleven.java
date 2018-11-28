package com.turchenkov.EleventhLesson;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Eleven implements Comparable, Comparator {
    public static void main(String[] args) {

//        String[] mas = new String[]{"qwerty", "asd", "zxcv"};
//
//        StringComparer stringComparer = new StringComparer();
//        Arrays.sort(mas, stringComparer);
//
//        System.out.println(Arrays.toString(mas));
//
//        Comparator<String> comparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return Integer.compare(o1.length(),o2.length());
//            }
//        };
//
//        Arrays.sort(mas, comparator);
//
//        System.out.println(Arrays.toString(mas));
//
//        String[] mas2 = new String[]{"333333", "22", "123"};
//        Arrays.sort(mas2, Comparator.comparingInt(String::length));
//        System.out.println(Arrays.toString(mas2));
//
//        Arrays.sort(mas2, (String o1, String o2) -> {
//            if (o1.length() > o2.length()) {
//                return -1;
//            } else if (o1.length() == o2.length()) {
//                return 0;
//            } else {
//                return 1;
//            }
//        });
//
//        System.out.println(Arrays.toString(mas2));
//
//        BiFunction<String, String, Integer> compareFunc = (String s1, String s2) -> {
//            return Integer.compare(s1.length(), s2.length());
//        };
//
//        System.out.println();
//
//        System.out.println(Arrays.stream(mas).filter((s) -> s.length() > 3).map(x -> x + " changed").collect(Collectors.toList()));

        Student[] students = new Student[]{new Student("Ivan", 20, 5),
                new Student("Petr", 21, 4),
                new Student("Alexandr", 30, 4),
                new Student("Masha", 25, 4)};
        Arrays.sort(students, (x1, x2) -> x1.getName().compareTo(x2.getName()));

        for (Student student : students) {
            System.out.println(student);
        }



        for (Student student : students) {
            System.out.println(student.getName());
        }

        System.out.println(Arrays.stream(students)
                .map(x -> x.getMark())
                .reduce(0, (acc, x) -> acc + x) / students.length);


    }

    static class StringComparer implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            if (o1.length() > o2.length()) {
                return -1;
            } else if (o1.length() == o2.length()) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}


class Student{

    private String name;
    private int age;
    private int mark;

    public Student() {
    }

    public Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
