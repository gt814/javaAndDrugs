package ru.bse71.bugs;

public class PoolExample {

    public static void main(String[] args) {
        execNumberEquals(1, 10, 10);
        execNumberEquals(2, 10F, 10F);
        System.out.println();

        execNumberEquals(3,100, 100);
        execNumberEquals(4, 100F, 100F);
        System.out.println();

        execNumberEquals(5,1000, 1000);
        execNumberEquals(6, 1000F, 1000F);
        System.out.println();

        execNumberEquals(7,10000, 10000);
        execNumberEquals(8, 10000F, 10000F);
    }

    private static void execNumberEquals(int testNumber, Number number1, Number number2) {
        System.out.println(testNumber + ": Числа " +
                (number1 == number2 ?
                        "равны" : "не равны"));
    }
}
