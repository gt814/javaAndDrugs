package ru.bse71.bugs;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        Set<Number> numberSet = new TreeSet<>();

        numberSet.add(1);
        numberSet.add(1L);
        numberSet.add(1.0);
        numberSet.add(1F);

        System.out.println(numberSet.size());
    }

}
