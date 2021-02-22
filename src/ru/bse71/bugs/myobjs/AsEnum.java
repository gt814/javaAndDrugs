package ru.bse71.bugs.myobjs;

public class AsEnum {
    public static final AsEnum A = new AsEnum();
    public static final AsEnum B = new AsEnum();

    public AsEnum() {
        System.out.println("constructor");
    }

    {
        System.out.println("init");
    }

    static {
        System.out.println("static");
    }
}
