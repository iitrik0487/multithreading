package com.example.thread.creation;

public class ThreadCreationPart1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Executing thread "+ Thread.currentThread().getName());
            }
        });

        thread.setName("New Worker Thread");
        System.out.println("Before startig the the new thread we are in : "+ Thread.currentThread().getName());
        thread.start();
        System.out.println("After startig the the new thread we are in : "+ Thread.currentThread().getName());
    }
}
