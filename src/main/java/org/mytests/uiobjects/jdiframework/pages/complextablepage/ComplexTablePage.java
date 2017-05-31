package org.mytests.uiobjects.jdiframework.pages.complextablepage;

import com.epam.jdi.uitests.web.selenium.elements.complex.table.EntityTable;
import com.epam.jdi.uitests.web.selenium.elements.complex.table.Table;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JTable;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mikhail_Churakov on 5/29/2017.
 */
public class ComplexTablePage extends WebPage {
    /*@JTable(
            root = @FindBy(css = ".uui-table"),
            row = @FindBy(xpath = ".//tr[%s]//td"),
            column = @FindBy(xpath = ".//tr//td[%s]"),
            header = {"Column 1", "Column 2", "Column 3"},
            rowsHeader = {"Microsoft Technologies", "Mobile", "UXD", "Version Control Systems",
            "JavaScript Components and Frameworks", "Software Construction", "Life Sciences",
                    "Content management"},
            headers = @FindBy(xpath = "//thead//th"),
            rowNames = @FindBy(xpath = "//td"),
            cell = @FindBy(xpath = "//tbody//tr[{1}]//td[{0}]"),
            footer = @FindBy(xpath = "//tfoot"),
            rowStartIndex = 1,
            colStartIndex = 1,
            useCache = false
    )*/
    @FindBy(css = ".table-delete-body")
    public EntityTable<Entity, Row> complexTable = new EntityTable<>(Entity.class, Row.class);


}
