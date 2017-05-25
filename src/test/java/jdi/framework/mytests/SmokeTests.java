package jdi.framework.mytests;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import com.epam.web.matcher.junit.Assert;
import org.mytests.enums.NavigationMenu;
import org.mytests.uiobjects.jdiframework.JdiSite;
import org.mytests.uiobjects.jdiframework.dataproviders.InputProvider;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.mytests.uiobjects.jdiframework.JdiSite.contactFormPage;
import static org.mytests.uiobjects.jdiframework.JdiSite.homePage;
import static org.mytests.uiobjects.jdiframework.JdiSite.navigationPanel;

/**
 * Created by Mikhail_Churakov on 5/23/2017.
 */
public class SmokeTests extends TestNGBase {
    @BeforeSuite
    public void setUp() {
        WebSite.init(JdiSite.class);
    }

    @BeforeTest
    public void openHost() {
        homePage.open();
    }

    @Test(dataProvider = "input", dataProviderClass = InputProvider.class)
    public void specifyContForm(String name, String lastName, String description) {
        homePage.shouldBeOpened();
        navigationPanel.loginButton.click();
        navigationPanel.loginPanel.login();
        navigationPanel.navigationMenu.select(NavigationMenu.CONTACT_FORM);
        contactFormPage.name.input(name);
        contactFormPage.lastName.input(lastName);
        contactFormPage.description.input(description);
        contactFormPage.submit.click();
        Assert.areEquals(contactFormPage.resultForm.name.getText(),"Name: " + name);
        Assert.areEquals(contactFormPage.resultForm.lastName.getText(),"Last Name: " + lastName);
        Assert.areEquals(contactFormPage.resultForm.description.getText(),"Description: " + description);
        navigationPanel.loginButton.click();
        navigationPanel.signOut.click();
    }

}
