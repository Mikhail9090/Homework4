package jdi.framework.mytests;

import com.epam.web.matcher.junit.Assert;
import org.mytests.enums.NavigationMenu;
import org.mytests.uiobjects.jdiframework.dataproviders.InputProvider;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.isInState;
import static org.mytests.enums.States.LOGGED_IN;
import static org.mytests.enums.States.LOGGED_OUT;
import static org.mytests.uiobjects.jdiframework.JdiSite.contactFormPage;
import static org.mytests.uiobjects.jdiframework.JdiSite.homePage;

/**
 * Created by Mikhail_Churakov on 6/4/2017.
 */
public class ContactFormTests extends InitTests {
    @BeforeMethod
    public void checkLogin(){
        isInState(LOGGED_IN);
    }

    @Test(dataProvider = "input", dataProviderClass = InputProvider.class)
    public void specifyContForm(String name, String lastName, String description) {
        homePage.navigationPanel.navigationMenu.select(NavigationMenu.CONTACT_FORM);
        contactFormPage.name.input(name);
        contactFormPage.lastName.input(lastName);
        contactFormPage.description.input(description);
        contactFormPage.submit.click();
        Assert.areEquals(contactFormPage.resultForm.name.getText(),"Name: " + name);
        Assert.areEquals(contactFormPage.resultForm.lastName.getText(),"Last Name: " + lastName);
        Assert.areEquals(contactFormPage.resultForm.description.getText(),"Description: " + description);
        isInState(LOGGED_OUT);
    }
}
