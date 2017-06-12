package jdi.framework.mytests;

import com.epam.commons.LinqUtils;
import com.epam.jdi.uitests.core.interfaces.complex.interfaces.ICell;
import com.epam.web.matcher.junit.Assert;
import com.google.common.collect.Table;
import javafx.scene.control.Cell;
import org.mytests.enums.ServiceMenu;
import org.mytests.uiobjects.jdiframework.pages.complextablepage.Entity;
import org.mytests.uiobjects.jdiframework.pages.complextablepage.Row;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.isInState;
import static org.mytests.enums.States.LOGGED_IN;
import static org.mytests.uiobjects.jdiframework.JdiSite.complexTablePage;
import static org.mytests.uiobjects.jdiframework.JdiSite.homePage;

/**
 * Created by Mikhail_Churakov on 6/4/2017.
 */
public class ComplexTableTests extends InitTests {
    @BeforeMethod
    public void checkLogin(){
        isInState(LOGGED_IN);
    }
    @Test()
    public void testEntityTable() {
        homePage.navigationPanel.serviceMenuDropdown.click();
        homePage.navigationPanel.serviceMenu.select(ServiceMenu.COMPLEX_TABLE);
        Assert.isTrue(complexTablePage.complexTable.isDisplayed());
        System.out.println("complexTablePage: " + complexTablePage);
        System.out.println("complexTablePage.complexTable: " + complexTablePage.complexTable);
        System.out.println("complexTablePage.complexTable.rows(): " + complexTablePage.complexTable.rows());
        System.out.println("complexTablePage.complexTable.rows().count(): " + complexTablePage.complexTable.rows().count());
        List<Entity> entities = complexTablePage.complexTable.entities();
        //List<String> actual = LinqUtils.select(entities, Entity::toString);
        //List<String> expected = new ArrayList<>();
        //Assert.listEquals(actual, expected);
    }

    @Test
    public void TableSizeWith3Columns() {
        homePage.navigationPanel.serviceMenuDropdown.click();
        homePage.navigationPanel.serviceMenu.select(ServiceMenu.COMPLEX_TABLE);
        Assert.isTrue(complexTablePage.complexTable.isDisplayed());
        complexTablePage.reestablish.doubleClicks();
        Assert.isTrue(complexTablePage.complexTable.columns().count() == 4);
        Assert.isTrue(complexTablePage.complexTable.rows().count() == 8);
    }
    @Test
    public void SelectJSinFirstColumn() {
        homePage.navigationPanel.serviceMenuDropdown.click();
        homePage.navigationPanel.serviceMenu.select(ServiceMenu.COMPLEX_TABLE);
        Assert.isTrue(complexTablePage.complexTable.isDisplayed());
        List<Row> rows = complexTablePage.complexTable.getRows(
                row -> row.column2.title.getText().contains("JavaScript")
        );
    }
}
