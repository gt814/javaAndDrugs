package ru.bse71.bugs.myobjs;

import java.util.ArrayList;
import java.util.List;

public final class MyFinalStringContainer {

    private final List<String> strings = new ArrayList<>();

    public void addString(String str) {
        strings.add(str);
    }

    public void print() {
        System.out.println(strings);
    }
}
