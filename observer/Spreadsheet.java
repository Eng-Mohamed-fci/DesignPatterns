package com.mowithmosh.observer;

public class Spreadsheet implements Observer{
    private DataSourse dataSourse;

    public Spreadsheet(DataSourse dataSourse) {
        this.dataSourse = dataSourse;
    }

    @Override
    public void update() {
        System.out.println("SpreadSheet got notified" + dataSourse.getValue());
    }
}
