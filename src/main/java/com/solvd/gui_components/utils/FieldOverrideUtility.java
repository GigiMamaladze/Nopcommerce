package com.solvd.gui_components.utils;

import com.zebrunner.carina.webdriver.gui.AbstractPage;

import java.lang.reflect.Field;

public class FieldOverrideUtility {
    public static <T extends P, P extends AbstractPage> void overrideField(T child, Class<P> parentClass)  {
        Class<?> currentClass = child.getClass();
        Field[] parentFields = parentClass.getDeclaredFields(); // Get parent class fields

        while (currentClass != null) {
            Field[] childFields = currentClass.getDeclaredFields();

            for (Field childField : childFields) {
                for (Field parentField : parentFields) {
                    if (childField.getName().equals(parentField.getName())) {
                        childField.setAccessible(true);
                        parentField.setAccessible(true);
                        try {
                            parentField.set(child, childField.get(child));
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
            currentClass = currentClass.getSuperclass();
        }
    }
}
