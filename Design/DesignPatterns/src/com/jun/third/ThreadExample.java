package com.jun.third;

class SharedResources{

    static final Object resource1 = new Object();
    static final Object resource2 = new Object();
}

class MyThread extends Thread{

    public void run() {
        synchronized (SharedResources.resource1){
            System.out.println(Thread.currentThread().getName()+" acquired resource 1");
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            synchronized (SharedResources.resource2){
                System.out.println(Thread.currentThread().getName()+" acquired resource 2");
            }
        }
    }
}

class Myrunnable implements Runnable{

    @Override
    public void run() {
        synchronized (SharedResources.resource1) {
            System.out.println(Thread.currentThread().getName() + " acquired resource 1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (SharedResources.resource2) {
                System.out.println(Thread.currentThread().getName() + " acquired resource 2");
            }
        }
    }
}
public class ThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();



        Thread t2 = new Thread(new Myrunnable());
        t2.start();


    }

}
