package jdi.framework.mytests;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import org.mytests.uiobjects.jdiframework.JdiSite;
import org.mytests.uiobjects.jdiframework.dataproviders.User;
import org.mytests.uiobjects.jdiframework.sections.LoginPanel;
import org.mytests.uiobjects.jdiframework.sections.NavigationPanel;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.mytests.uiobjects.jdiframework.JdiSite.homePage;
import static org.mytests.uiobjects.jdiframework.JdiSite.navigationPanel;

/**
 * Created by Mikhail_Churakov on 5/23/2017.
 */
public class SmokeTests extends TestNGBase {
    @BeforeSuite
    public void setUp() {
        WebSite.init(JdiSite.class);
        WebSite.init(NavigationPanel.class);
        WebSite.init(LoginPanel.class);
    }

    @BeforeTest
    public void openHost() {
        homePage.open();
    }

    @Test
    public void login(User user) {
        homePage.shouldBeOpened();
        navigationPanel.loginButton.click();
        navigationPanel.loginPanel.isDisplayed();
        navigationPanel.loginPanel.loginAs(user);
    }
}
