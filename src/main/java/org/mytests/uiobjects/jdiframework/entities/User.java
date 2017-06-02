package org.mytests.uiobjects.jdiframework.entities;


import org.testng.annotations.DataProvider;

/**
 * Created by Mikhail_Churakov on 5/23/2017.
 */
public class User {
    public static String login = "epam";
    public static String password = "1234";

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public User(){

    }
}
