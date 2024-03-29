package com.example.thread.creation;

public class CatchUncaughtException {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()-> {

            System.out.println("Executing thread "+ Thread.currentThread().getName());
            throw new RuntimeException("Exception thrown from "+ Thread.currentThread().getName());
        });

        thread.setName("Misbehaving Thread");
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Caught Exception in thread "+ Thread.currentThread().getName()+" throwing the exception "+ e.getMessage());
            }
        });
        System.out.println("Before startig the the new thread we are in : "+ Thread.currentThread().getName());
        thread.start();
        System.out.println("After startig the the new thread we are in : "+ Thread.currentThread().getName());
        //sleep doent span in backgroung for the millisecond mentioned but it just instructs the JVM to not to schedule the thread for the provided number of milli seconds
        thread.sleep(10000);
    }
}
