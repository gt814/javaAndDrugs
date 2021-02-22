package ru.bse71.bugs.myobjs;

public class ReadFinalWorker extends Thread {

    public static final int SLEEP_TIME_IN_MS = 500;
    private static final int MAX_COUNT = 8;

    private SimpleObjectWithFinalField simpleObject;

    public ReadFinalWorker(SimpleObjectWithFinalField simpleObject) {
        this.simpleObject = simpleObject;
    }

    @Override
    public void run() {

        for (int i = 0; i < MAX_COUNT; i++) {
            System.out.println(simpleObject.getFinalField());
            try {
                Thread.sleep(SLEEP_TIME_IN_MS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
