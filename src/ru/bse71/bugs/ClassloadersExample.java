package ru.bse71.bugs;

import ru.bse71.bugs.myobjs.SimpleClassLoader;

public class ClassloadersExample {

    public static final String CLASS_NAME = "SimpleClass";

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        SimpleClassLoader classLoader1 = new SimpleClassLoader();
        SimpleClassLoader classLoader2 = new SimpleClassLoader();

        Class<?> c1 = classLoader1.loadClass(CLASS_NAME);
        Class<?> c2 = classLoader2.loadClass(CLASS_NAME);
        Class<?> c3 = classLoader1.loadClass(CLASS_NAME);

        c3.cast(c1.newInstance());      //  1 строка
        c2.cast(c1.newInstance());      //  2 строка
    }
}
