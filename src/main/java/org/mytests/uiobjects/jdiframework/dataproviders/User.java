package org.mytests.uiobjects.jdiframework.dataproviders;


import org.testng.annotations.DataProvider;

/**
 * Created by Mikhail_Churakov on 5/23/2017.
 */
public class User {
    public static String login = "epam";
    public static String password = "1234";
    @DataProvider
    public Object[][] user() {
        return new Object[][] {
                {login, password}
        };
    }
}
