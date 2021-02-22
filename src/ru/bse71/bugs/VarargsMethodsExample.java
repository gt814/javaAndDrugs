package ru.bse71.bugs;

public class VarargsMethodsExample {

    public static void main(String[] args) {

//          Способ 1
//        someMethod(4, 5, 6, 7, 8);

        //  Способ 2
        int[] vars = new int[]{4, 5, 6, 7, 8};
        someMethod(vars);
    }

    private static void someMethod(int ... varargs) {
        System.out.println("Я получил примитивы!");
    }

    private static void someMethod(Integer ... varargs) {
        System.out.println("Я получил обертки!");
    }
}
