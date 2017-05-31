package org.mytests.enums;

/**
 * Created by Mikhail_Churakov on 5/28/2017.
 */
public enum ServiceMenu {
    SUPPORT("SUPPORT"),DATES("DATES"), COMPLEX_TABLE("COMPLEX TABLE"), SIMPLE_TABLE("SIMPLE TABLE"),TABLE_WITH_PAGES("TABLE WITH PAGES"), DIFFERENT_ELEMENTS("DIFFERENT ELEMENTS");

    public String value;
    ServiceMenu(String name) {
        value = name;
    }
}
