package com.example.thread.creation;

public class ExtendingThread {
    public static void main(String[] args) {
        Thread thread = new NewThread();
        thread.setName("New Worker Thread");
        thread.start();
    }
}

class NewThread extends Thread{
    @Override
    public void run(){
        System.out.println("Hello from "+this.getName());
    }
}
