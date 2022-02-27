package com.company;

public class Main {

    public static void main(String[] args) {

        OnTaskDoneListener donelistener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;
        Worker worker = new Worker(donelistener, errorListener);
        worker.start();

    }
}
