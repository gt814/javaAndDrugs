package ru.bse71.bugs;

public class TrimmingExample {

    public static void main(String[] args) {

        String str1 = "hello!";
        String str2 = "   hello!  ";

        System.out.println(
                str1.trim() == str1.trim()
        );

        System.out.println(
                str2.trim() == str2.trim()
        );
    }
}
