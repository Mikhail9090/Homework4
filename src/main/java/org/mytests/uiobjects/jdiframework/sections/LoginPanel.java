package org.mytests.uiobjects.jdiframework.sections;

import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import org.mytests.uiobjects.jdiframework.dataproviders.User;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

/**
 * Created by Mikhail_Churakov on 5/23/2017.
 */
public class LoginPanel extends Form<User>{
    @FindBy(id = "Login")
    public TextField login;
    @FindBy(id = "Password")
    public TextField password;
    @FindBy(css = ".fa-sign-in")
    public Button signIn;
    @FindBy(css = ".fa-sign-out")
    public Button signOut;
}