package ru.bse71.bugs.myobjs;

public class PrintAllActionObject {

    public PrintAllActionObject() {
        System.out.println("Init new object");
    }

    public void method() {
        System.out.println("Method!");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object will be lost");
    }
}
