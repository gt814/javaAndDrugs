package ru.bse71.bugs;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class BooleanExample {

    public static void main(String[] args) {

        printBoolean(1, true);

        sideEffect();
        printBoolean(2, true);
    }

    private static void printBoolean(int testNumber, Boolean bool) {
        System.out.println(testNumber + ": Значение - " + bool);
    }

    private static void sideEffect() {
        try {
            final Field trueValue = Boolean.class.getDeclaredField("TRUE");

            final Field modifiers = Field.class.getDeclaredField("modifiers");
            modifiers.setAccessible(true);
            modifiers.setInt(trueValue, trueValue.getModifiers() & ~Modifier.FINAL);

            trueValue.setAccessible(true);
            trueValue.set(Boolean.FALSE, Boolean.FALSE);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
