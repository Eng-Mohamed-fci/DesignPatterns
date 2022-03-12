package com.mowithmosh.observer;

public class Chart implements Observer{
    private DataSourse dataSourse;

    public Chart(DataSourse dataSourse) {
        this.dataSourse = dataSourse;
    }

    @Override
    public void update() {
        System.out.println("Char got updated" + dataSourse.getValue());
    }
}
