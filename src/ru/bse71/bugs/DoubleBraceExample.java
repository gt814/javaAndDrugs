package ru.bse71.bugs;

import ru.bse71.bugs.myobjs.MyFinalStringContainer;
import ru.bse71.bugs.myobjs.MyStringContainer;

public class DoubleBraceExample {

    public static void main(String[] args) {

        MyStringContainer myStringContainer = new MyStringContainer() {

            String myString;
            {
                myString = "str";
                addString("Просто");
                addString("набор");
                addString("каких-то");
                addString("слов");
            }
        };

        myStringContainer.print();
    }
}
