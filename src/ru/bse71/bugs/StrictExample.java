package ru.bse71.bugs;

public class StrictExample {

    public static void main(String[] args) {

        int number1 = 100;
        int number2 = 100;
        double division = 3.0;

        number1 /= division;

        number1 = (int) (number2 / division);

        boolean isEqualNumbers = number1 == number2 / division;

        System.out.println("Результаты " +
                (isEqualNumbers ? "равны" : "не равны"));
    }
}
