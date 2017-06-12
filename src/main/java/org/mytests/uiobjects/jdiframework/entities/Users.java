package org.mytests.uiobjects.jdiframework.entities;

/**
 * Created by Mikhail_Churakov on 5/31/2017.
 */
public class Users {
    public static User DEFAULT = new User();
    public static User EMPTY_PASSWORD = new User("epam", "");
    public static User EMPTY_LOGIN = new User("","1234");
    public static User EMPTY_DATA = new User("","");
    public static User INVALID_LOGIN = new User("Epam","1234");
    public static User INVALID_PASSWORD = new User("epam","12345");
}
