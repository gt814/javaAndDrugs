package ru.bse71.bugs;

import ru.bse71.bugs.myobjs.SimpleObjectWithFinalField;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static ru.bse71.bugs.myobjs.ReadFinalWorker.SLEEP_TIME_IN_MS;

public class FinalExample {

    public static void main(String[] args) throws InterruptedException {
        SimpleObjectWithFinalField simpleObject = new SimpleObjectWithFinalField(5);

        Thread.sleep(SLEEP_TIME_IN_MS);

        changeFinalField(simpleObject, 10);
    }

    private static void changeFinalField(SimpleObjectWithFinalField object, int newFieldValue) {
        try {
            final Field trueValue = SimpleObjectWithFinalField.class.getDeclaredField("finalField");

            final Field modifiers = Field.class.getDeclaredField("modifiers");
            modifiers.setAccessible(true);
            modifiers.setInt(trueValue, trueValue.getModifiers() & ~Modifier.FINAL);

            trueValue.setAccessible(true);
            trueValue.set(object, newFieldValue);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
