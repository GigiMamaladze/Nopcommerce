package com.solvd.gui_components.enums;

public enum SubCategory {

    // Computer

    DESKTOP("Desktops"),
    NOTEBOOKS("Notebooks"),
    SOFTWARE("Software"),

    // Electronics

    CAMERA_AND_PHOTOS("Camera & photo"),
    CELL_PHONES("Cell phones"),
    OTHERS("Others"),

    // Apparel

    SHOES("Shoes"),
    CLOTHING("Clothing"),
    ACCESSORIES("Accessories");

    private final String subCategory;

    SubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getSubCategory() {
        return subCategory;
    }
}