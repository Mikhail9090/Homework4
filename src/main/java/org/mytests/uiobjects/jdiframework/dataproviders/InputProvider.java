package org.mytests.uiobjects.jdiframework.dataproviders;

import org.testng.annotations.DataProvider;

/**
 * Created by Mikhail_Churakov on 5/25/2017.
 */
public class InputProvider {
    @DataProvider(name = "input")
    public static Object[][] input() {
        return new Object[][] {
                {"epam", "testLastName", "student"},
                {"epam", "admin", "student2"}
        };
    }
}
