package ru.bse71.bugs;

public class OverloadExample {

    public static void main(String[] args) {

        byte arg1 = 4;
        byte arg2 = 0x12;
        someMethod(arg1, arg2);
    }

    private static void someMethod(long arg1, short arg2) {
        System.out.println("long, short");
    }

    private static void someMethod(Byte arg1, Byte arg2) {
        System.out.println("Bytes");
    }

    private static void someMethod(byte ... args) {
        System.out.println("bytes vararg");
    }
}
