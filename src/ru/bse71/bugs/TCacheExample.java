package ru.bse71.bugs;

import ru.bse71.bugs.myobjs.SimpleObjectWithBooleanAndIntFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class TCacheExample {

    public static void main(String[] args) {

        final SimpleObjectWithBooleanAndIntFields object = new SimpleObjectWithBooleanAndIntFields(10);

        //  Поток выводящий значение
        new MyThread(object) {
            @Override
            public void run() {
                while(!object.isBooleanField());
                System.out.println(object.getIntField());
            }
        }.start();

        //  Поток задающий значение
        new MyThread(object) {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                object.setIntField(100);
                object.setBooleanField(true);
            }
        }.start();
    }

    static abstract class MyThread extends Thread {
        SimpleObjectWithBooleanAndIntFields object;

        public MyThread(SimpleObjectWithBooleanAndIntFields object) {
            this.object = object;
        }
    }


}
