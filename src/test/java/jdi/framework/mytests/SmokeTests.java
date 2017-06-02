package jdi.framework.mytests;

import com.epam.commons.LinqUtils;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import com.epam.web.matcher.junit.Assert;
import org.mytests.enums.NavigationMenu;
import org.mytests.enums.ServiceMenu;
import org.mytests.uiobjects.jdiframework.JdiSite;
import org.mytests.uiobjects.jdiframework.dataproviders.InputProvider;
import org.mytests.uiobjects.jdiframework.dataproviders.simpletablepage.SimpleTableProvider;
import org.mytests.uiobjects.jdiframework.pages.complextablepage.Entity;
import org.testng.annotations.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.mytests.uiobjects.jdiframework.JdiSite.*;

/**
 * Created by Mikhail_Churakov on 5/23/2017.
 */
public class SmokeTests extends InitTests {

    @BeforeMethod
    public void login() {
        homePage.shouldBeOpened();
        homePage.navigationPanel.loginButton.click();
        homePage.navigationPanel.loginPanel.login();
    }
    @AfterMethod
    public void logOut() {
        homePage.navigationPanel.loginButton.click();
        homePage.navigationPanel.signOut.click();
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
    }


    @Test
    public void setDateAndTime() {
        homePage.navigationPanel.serviceMenuDropdown.click();
        homePage.navigationPanel.serviceMenu.select(ServiceMenu.DATES);
        datesPage.timeButton.click();
        datesPage.timePicker.changeMeridian.click();
        datesPage.timePicker.decrementHour.click();
        datesPage.timePicker.decrementMinute.click();
        Assert.areEquals(datesPage.logPanel.lastLogData.getText(),getCurrentTime() +
                                            " Time: value changed to " + datesPage.timeInput.getText());
        Assert.areEquals(datesPage.timeInput.getText(), datesPage.timePicker.hourInput.getText() + ":" +
                                                        datesPage.timePicker.minuteInput.getText() + " " +
                                                        datesPage.timePicker.meridianInput.getText());
        //datesPage.dateButton.click();
    }
    @Test(dataProvider = "simpleTable", dataProviderClass = SimpleTableProvider.class)
    public void testSimpleTable(int column, int row, String data) {
        homePage.navigationPanel.serviceMenuDropdown.click();
        homePage.navigationPanel.serviceMenu.select(ServiceMenu.SIMPLE_TABLE);
        simpleTablePage.simpleTable.cell(column,row).click();
        Assert.areEquals(simpleTablePage.logPanel.lastLogData.getText(), getCurrentTime() +
                " :value=" + data + "; cell has been selected");
    }
    @Test()
    public void testEntityTable() {
        homePage.navigationPanel.serviceMenuDropdown.click();
        homePage.navigationPanel.serviceMenu.select(ServiceMenu.COMPLEX_TABLE);
        List<Entity> entities = complexTablePage.complexTable.entities();
        List<String> actual = LinqUtils.select(entities, Entity::toString);
        //List<String> expected = new ArrayList<>();
        //Assert.listEquals(actual, expected);
    }
}
