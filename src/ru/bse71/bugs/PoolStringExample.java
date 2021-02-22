package ru.bse71.bugs;

public class PoolStringExample {

    public static void main(String[] args) {

        execStringEquals(1, "hello!", "hello!");

        execStringEquals(2, "hel" + "lo!", "hello!");

        String halfStr1 = "hel";
        String halfStr2 = "lo!";
        execStringEquals(3, halfStr1 + halfStr2, "hello!");

        execStringEquals(4,
                new String("hello!"),
                "hello!");

        execStringEquals(5,
                new String("hello!").intern(),
                "hello!");
    }

    private static void execStringEquals(int testNumber, String str1, String str2) {
        System.out.println(testNumber + ": Строки " +
                (str1 == str2 ?
                        "равны" : "не равны"));
    }
}
