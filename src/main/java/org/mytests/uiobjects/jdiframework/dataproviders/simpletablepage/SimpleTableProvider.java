package org.mytests.uiobjects.jdiframework.dataproviders.simpletablepage;

import org.testng.annotations.DataProvider;

/**
 * Created by Mikhail_Churakov on 5/28/2017.
 */
public class SimpleTableProvider {
    @DataProvider(name = "simpleTable")
    public static Object[][] simpleTable() {
        return new Object[][] {
                {1, 1, "Drivers"},
                {3, 6, "Cucumber, Jbehave, Thucydides, SpecFlow"}
        };
    }
}
