package com.turchenkov.SixthLesson;

import java.io.FileInputStream;
import java.io.InputStream;

public class SixMain {
    public static void main(String[] args) throws Throwable {

        //Scanner scanner = new Scanner(System.in);

        int b = 0;


        //InputStream is = null;

//        try {
//            exc(b);
//        }
//        catch (RuntimeException e){
//            System.out.println(e.getCause());
////            System.out.println(e.getMessage());
////            System.out.println(e.getClass());
////            System.out.println(e.fillInStackTrace());
////            System.out.println(Thread.currentThread());
////            e.printStackTrace();
//        }

//        try {
//            throw new RuntimeException();
//        }
//        finally {
//            System.out.println("Finally");
//            //return; //нет вывода об ощибке
//            throw new Exception();
//        }


//        try {
//            cycle();
//        }
//        catch (Error e){
//            System.out.println(e);
//            e.printStackTrace();
//        } catch (MyException e) {
//            System.out.println("MyException");
//            e.printStackTrace();
//        }

//        try (InputStream is = new FileInputStream ("...")){ //autocloseable
//            is.read();
//        }
//        catch (Exception e){
//
//        }

        try (A a = new A()){
            System.out.println("Try");
        }
        //bit.ly/2DhkujK
    }

    private static void exc(int b) {
        try {
            check(b);
            //System.exit(1);
        }
        catch (Exception e){ //multiple catch
            System.out.println(e.getCause());
            throw new RuntimeException("message", e);
        }
//        finally {
//            if (is != null){
//                is.close();
//            }
//        }
    }

    static void check(int a) throws MyException {
        if (a == 0) {
            throw new MyException();
        } else {
            System.out.println("Good number " + a);
        }
    }

    static void cycle() throws MyException {
        throw new MyException();
    }
}

class MyException extends Exception {

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(Exception cause) {
        super(cause);
    }

    public static void print(){
        System.out.println("WOF!");
    }
}

class A implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("CLOSE");
    }
}
