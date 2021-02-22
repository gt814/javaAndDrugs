package ru.bse71.bugs;

public class UnaryExample {

    public static void main(String[] args) {

        byte number = Byte.MIN_VALUE;
        System.out.println(-number > Byte.MAX_VALUE);

        long numberLong = Long.MIN_VALUE;
        System.out.println(numberLong == -numberLong);
    }
}
