package com.solvd.gui_components.enums;

public enum Month {

    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("December");

    private final String month;

    Month(String month) {
        this.month = month;
    }

    public String getMonth() {
        return month;
    }
}