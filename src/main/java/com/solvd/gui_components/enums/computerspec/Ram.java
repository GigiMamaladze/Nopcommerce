package com.solvd.gui_components.enums.computerspec;

public enum Ram {

    RAM_2GB("2 GB"),
    RAM_4GB("4GB [+$20.00]"),
    RAM_8GB("8GB [+$60.00]");

    private final String ram;

    Ram(String ram) {
        this.ram = ram;
    }

    public String getRam() {
        return ram;
    }
}
