package ru.bse71.bugs;

public class TWaitExample {

    public static void main(String[] args) throws InterruptedException {

        final Thread thread = new Thread(() -> System.out.println("Я поток!"));

        synchronized (thread) {
            thread.start();
            thread.wait();
        }

        System.out.println("Завершение главного потока!");

    }
}
