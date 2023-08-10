package com.solvd.gui_components.enums;


public enum ComputerSpec {

    PROCESSOR_INTEL_PENTIUM_DUAL_CORE_2_2_GHZ("2.2 GHz Intel Pentium Dual-Core E2200"),
    PROCESSOR_INTEL_PENTIUM_DUAL_CORE_2_5_GHZ("2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]"),
    RAM_2GB("2 GB"),
    RAM_4GB("4GB [+$20.00]"),
    RAM_8GB("8GB [+$60.00]"),
    HDD_320GB("320 GB"),
    HDD_400GB("400 GB [+$100.00]");

    private final String spec;

    ComputerSpec(String spec) {
        this.spec = spec;
    }

    public String getSpec() {
        return spec;
    }
}