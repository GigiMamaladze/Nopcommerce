package com.solvd.gui_components.enums.computerspec;

public enum Processor {

    PROCESSOR_INTEL_PENTIUM_DUAL_CORE_2_2_GHZ("2.2 GHz Intel Pentium Dual-Core E2200"),
    PROCESSOR_INTEL_PENTIUM_DUAL_CORE_2_5_GHZ("2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]");

    private final String processor;

    Processor(String processor) {
        this.processor = processor;
    }

    public String getProcessor() {
        return processor;
    }
}
