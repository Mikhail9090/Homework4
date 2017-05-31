package org.mytests.uiobjects.jdiframework.pages.complextablepage;

/**
 * Created by Mikhail_Churakov on 5/29/2017.
 */
public class Entity {
    public String technology;
    public String column1;
    public String column2;
    public String column3;
    @Override
    public String toString() {
        return technology + ";" + column1 + ";" + column2 + ";" + column3;
    }
}
