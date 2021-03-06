package org.mytests.uiobjects.jdiframework.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import org.mytests.uiobjects.jdiframework.entities.User;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mikhail_Churakov on 5/23/2017.
 */
public class LoginPanel extends Form<User>{
    @FindBy(id = "Login")
    public TextField login;
    @FindBy(id = "Password")
    public TextField password;
    @FindBy(css = ".fa-sign-in")
    public Button loginButton;
    @FindBy(css = ".login-txt")
    public Label errorMessage;
    /*public void login() {
        loginInput.input(User.login);
        password.input(User.password);
        loginButton.click();
    }*/
}
