package ru.bse71.bugs;

public class TernarExample {

    public static void main(String[] args) {

        System.out.println(
                getByTern(true));

        System.out.println(
                getByIf(true));
    }

    private static Object getByTern(boolean bool) {
        return bool ? new Integer(1) : new Double(1.0);
    }

    private static Object getByIf(boolean bool) {
        if (bool) {
            return new Integer(1);
        } else {
            return new Double(1.0);
        }
    }
}
