package org.mytests.uiobjects.jdiframework.pages.complextablepage;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.complex.table.EntityTable;
import com.epam.jdi.uitests.web.selenium.elements.complex.table.Table;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JTable;
import org.openqa.selenium.support.FindBy;

import static com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.TableHeaderTypes.ALL_HEADERS;

/**
 * Created by Mikhail_Churakov on 5/29/2017.
 */
public class ComplexTablePage extends WebPage {
    @JTable(
            root = @FindBy(css = "table.table-delete-body"),
            headerType = ALL_HEADERS,
            colStartIndex = 2
    )
    public EntityTable<Entity, Row> complexTable = new EntityTable<>(Entity.class, Row.class);
    @FindBy(xpath = "//button[@class='uui-button dark-blue']")
    public Button reestablish;

}
