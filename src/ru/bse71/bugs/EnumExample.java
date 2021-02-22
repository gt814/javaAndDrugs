package ru.bse71.bugs;

import ru.bse71.bugs.myobjs.AsEnum;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class EnumExample {

    public static void main(String[] args) {

        MyEnum myEnum = MyEnum.A;

    }

    enum MyEnum {
        A,
        B;

        MyEnum() {
            System.out.println("constructor");
        }

        {
            System.out.println("init");
        }

        static {
            System.out.println("static");
        }
    }


}
