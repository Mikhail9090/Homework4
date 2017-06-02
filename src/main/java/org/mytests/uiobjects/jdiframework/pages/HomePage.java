package org.mytests.uiobjects.jdiframework.pages;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.mytests.uiobjects.jdiframework.entities.User;
import org.mytests.uiobjects.jdiframework.entities.Users;
import org.mytests.uiobjects.jdiframework.sections.NavigationPanel;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mikhail_Churakov on 5/23/2017.
 */
public class HomePage extends WebPage {
    @FindBy(css = "nav[role='navigation']")
    public NavigationPanel navigationPanel;

    public boolean isLoggedIn() {
        return !navigationPanel.userNameLabel.isDisplayed();
    }

    public void login() {
        login(Users.DEFAULT);
    }

    public void login(User user){
        navigationPanel.loginButton.click();
        navigationPanel.loginPanel.login(user);
    }

    public void logout() {
        if(!navigationPanel.signOut.isDisplayed())
            navigationPanel.loginButton.click();
        navigationPanel.signOut.click();
    }
}
