package org.mytests.enums;

/**
 * Created by Mikhail_Churakov on 5/24/2017.
 */
public enum NavigationMenu {
    HOME("HOME"),CONTACT_FORM("CONTACT FORM"), SERVICE("SERVICE"), METALS_COLORS("METALS & COLORS");

    public String value;
    NavigationMenu(String name) {
        value = name;
    }
}
