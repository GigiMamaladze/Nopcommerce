package com.solvd.gui_components.enums.computerspec;

public enum Hdd {

    HDD_320GB("320 GB"),
    HDD_400GB("400 GB [+$100.00]");

    private final String hdd;

    Hdd(String hdd) {
        this.hdd = hdd;
    }

    public String getHdd() {
        return hdd;
    }
}
