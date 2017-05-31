package org.mytests.uiobjects.jdiframework.pages;

import com.epam.jdi.uitests.web.selenium.elements.complex.table.Table;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JTable;
import org.mytests.uiobjects.jdiframework.sections.Log;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mikhail_Churakov on 5/28/2017.
 */
public class SimpleTablePage extends WebPage {
    @JTable(
            root = @FindBy(css = ".uui-table"),
            row = @FindBy(xpath = ".//tr[%s]//td"),
            column = @FindBy(xpath = ".//tr//td[%s]"),
            rowsHeader = {"Drivers", "Test Runner", "Asserter ", "Logger", "Reporter", "BDD/DSL"},
            headers = @FindBy(xpath = "//tr//td[1]"),
            rowNames = @FindBy(xpath = "//td"),
            cell = @FindBy(xpath = "//tr[{1}]//td[{0}]"),
            height = 6,
            width = 3,
            size = "3x6",
            rowStartIndex = 1,
            colStartIndex = 1,
            useCache = false
    )
    public Table simpleTable;
    @FindBy(css = ".info-panel-body-log")
    public Log logPanel;
}
