package ru.bse71.bugs;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListExample {

    public static void main(String[] args) {

        List numbers = new ArrayList<Integer>(3);

        numbers.add(1);
        numbers.add(2);
        numbers.add(new Thread("поток номер три"));
        numbers.add(new String("Чур я четыре!"));

        System.out.println(numbers.size());
    }

}
