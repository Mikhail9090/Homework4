package jdi.framework.mytests;

import com.epam.web.matcher.junit.Assert;
import org.mytests.enums.ServiceMenu;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.isInState;
import static org.mytests.enums.States.LOGGED_IN;
import static org.mytests.uiobjects.jdiframework.JdiSite.datesPage;
import static org.mytests.uiobjects.jdiframework.JdiSite.homePage;

/**
 * Created by Mikhail_Churakov on 6/4/2017.
 */
public class DatesTimeTests extends InitTests {
    @BeforeMethod
    public void checkLogin(){
        isInState(LOGGED_IN);
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
    }
}
