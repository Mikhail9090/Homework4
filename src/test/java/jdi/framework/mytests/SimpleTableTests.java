package jdi.framework.mytests;

import com.epam.web.matcher.junit.Assert;
import org.mytests.enums.ServiceMenu;
import org.mytests.uiobjects.jdiframework.dataproviders.simpletablepage.SimpleTableProvider;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.isInState;
import static org.mytests.enums.States.LOGGED_IN;
import static org.mytests.enums.States.LOGGED_OUT;
import static org.mytests.uiobjects.jdiframework.JdiSite.homePage;
import static org.mytests.uiobjects.jdiframework.JdiSite.simpleTablePage;

/**
 * Created by Mikhail_Churakov on 6/4/2017.
 */
public class SimpleTableTests extends InitTests{
    @BeforeMethod
    public void checkLogin(){
        isInState(LOGGED_IN);
    }
    @Test(dataProvider = "simpleTable", dataProviderClass = SimpleTableProvider.class)
    public void testContent(int column, int row, String data) {
        homePage.navigationPanel.serviceMenuDropdown.click();
        homePage.navigationPanel.serviceMenu.select(ServiceMenu.SIMPLE_TABLE);
        Assert.isTrue(simpleTablePage.simpleTable.isDisplayed());
        simpleTablePage.simpleTable.cell(column,row).click();
        Assert.areEquals(simpleTablePage.logPanel.lastLogData.getText(), getCurrentTime() +
                " :value=" + data + "; cell has been selected");
        isInState(LOGGED_OUT);
    }
    @Test
    public void testTableSize() {
        homePage.navigationPanel.serviceMenuDropdown.click();
        homePage.navigationPanel.serviceMenu.select(ServiceMenu.SIMPLE_TABLE);
        Assert.isTrue(simpleTablePage.simpleTable.isDisplayed());
        Assert.isTrue(simpleTablePage.simpleTable.rows().count()  == 6);
        Assert.isTrue(simpleTablePage.simpleTable.columns().count() == 3);
    }
}
