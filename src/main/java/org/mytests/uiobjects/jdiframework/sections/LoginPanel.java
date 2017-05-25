package org.mytests.uiobjects.jdiframework.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import org.mytests.uiobjects.jdiframework.dataproviders.User;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mikhail_Churakov on 5/23/2017.
 */
public class LoginPanel extends Form<User>{
    @FindBy(id = "Login")
    public TextField loginInput;
    @FindBy(id = "Password")
    public TextField password;
    @FindBy(css = ".fa-sign-in")
    public Button loginButton;

    public void login() {
        loginInput.input(User.login);
        password.input(User.password);
        loginButton.click();
    }
}
