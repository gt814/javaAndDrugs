package ru.bse71.bugs.myobjs;

public class SimpleObjectWithBooleanAndIntFields {

    private int intField;
    private volatile boolean booleanField;

    public SimpleObjectWithBooleanAndIntFields(int intField) {
        this.intField = intField;
    }

    public int getIntField() {
        return intField;
    }

    public void setIntField(int intField) {
        this.intField = intField;
    }

    public boolean isBooleanField() {
        return booleanField;
    }

    public void setBooleanField(boolean booleanField) {
        this.booleanField = booleanField;
    }
}
