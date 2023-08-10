package com.solvd.gui_components.enums;

public enum Category {

    COMPUTERS("Computers"),
    ELECTRONICS("Electronics"),
    APPAREL("Apparel"),
    DIGITAL_DOWNLOADS("Digital downloads"),
    BOOKS("Books"),
    JEWELRY("Jewelry"),
    GIFT_CARDS("Gift Cards");

    private final String category;

    Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}