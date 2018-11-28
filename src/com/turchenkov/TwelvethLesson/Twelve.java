package com.turchenkov.TwelvethLesson;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Twelve {

    static final Object lock = new Object();

    public static String resource = "1";
    public static Lock lock2 = new ReentrantLock();

    //в спринг есть оболочка над таймерами!
    //asmal95
    public static void main(String[] args) throws InterruptedException {
//        MyThread mt = new MyThread("User");
//        mt.setPriority(10);
//        mt.start();
//        mt.sayHello();

//        for (int i = 0; i < 10; i++) {
//            new Thread(new SynchronizedTest()).start();
//        }
//
//        for (int i = 0; i < 10; i++) {
//            try {
//                TimeUnit.SECONDS.sleep(2);
//                System.out.println("Awake some thread");
//
//                synchronized (lock) {
//                    Twelve.lock.notify();
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

//        Timer timer = new Timer();
//        timer.schedule(new Task(), 4*1000, 2*1000);
//        TimeUnit.SECONDS.sleep(10);
//        //timer.cancel();
//        System.out.println("scheduleAtFixedRate");
//        timer.scheduleAtFixedRate(new Task(), 4*1000, 2*1000);
//
//        System.out.println("Main finished: " + Thread.currentThread().getName() + " " + Thread.currentThread().isInterrupted());

        for (int i = 0; i < 10; i++){
            Thread thread = new Thread(new Task());
            thread.start();
        }
    }
}

class SynchronizedTest implements Runnable {

    @Override
    public void run() {

        synchronized (Twelve.lock) {
            try {
                System.out.println("Thread " + Thread.currentThread().getName() + " sleep");
                System.out.println();
                Twelve.lock.wait();
                System.out.println("Thread " + Thread.currentThread().getName() + " awake");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        System.out.println("finished " + Thread.currentThread().getName());
        System.out.println("__________________");
        System.out.println();
    }
}


class Task extends TimerTask {

    @Override
    public void run() {
        //System.out.println("Thread: " + Thread.currentThread().getName());
        try {
            String name = Thread.currentThread().getName();
            if (Twelve.lock2.tryLock(5, TimeUnit.SECONDS)){
                try {
                    System.out.println(name + " got lock");
                    Twelve.resource += "1";
                    Twelve.lock2.lock();
                }
                catch (Exception ex){
                    System.out.println("Can't lock");
                }
                finally {
                    Twelve.lock2.unlock();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class MyThread extends Thread {
    String name;

    public MyThread(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, " + name);
    }
}
