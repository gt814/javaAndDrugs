package ru.bse71.bugs.myobjs;

import static ru.bse71.bugs.myobjs.ReadFinalWorker.SLEEP_TIME_IN_MS;

public class SimpleObjectWithFinalField {

    private final int finalField;

    public SimpleObjectWithFinalField(int finalField) {

        publishObject();
        this.finalField = finalField;
    }

    public void publishObject() {
        ReadFinalWorker initWorker = new ReadFinalWorker(this);
        initWorker.start();
        try {
            Thread.sleep(2 * SLEEP_TIME_IN_MS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getFinalField() {
        return finalField;
    }
}
