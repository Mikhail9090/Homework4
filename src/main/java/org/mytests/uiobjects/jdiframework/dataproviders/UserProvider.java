package org.mytests.uiobjects.jdiframework.dataproviders;

import org.mytests.uiobjects.jdiframework.entities.Users;
import org.testng.annotations.DataProvider;

/**
 * Created by Mikhail_Churakov on 5/29/2017.
 */
public class UserProvider {
    @DataProvider(name = "users")
    public static Object[][] user() {
        return new Object[][] {
                {Users.DEFAULT}
        };
    }
    @DataProvider(name = "badUsers")
    public static Object[][] badUser() {
        return new Object[][] {
                {Users.EMPTY_PASSWORD},
                {Users.EMPTY_LOGIN},
                {Users.EMPTY_DATA},
                {Users.INVALID_LOGIN},
                {Users.INVALID_PASSWORD}
        };
    }
}
