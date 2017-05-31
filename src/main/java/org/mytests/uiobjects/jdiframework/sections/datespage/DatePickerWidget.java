package org.mytests.uiobjects.jdiframework.sections.datespage;

import com.epam.jdi.uitests.web.selenium.elements.complex.table.Table;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JTable;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mikhail_Churakov on 5/28/2017.
 */
public class DatePickerWidget extends Section {
    @JTable(
            root = @FindBy(css = ".datepicker-days"),
            row = @FindBy(css = "tbody>tr"),
            column = @FindBy(css = "tbody>tr>td"),
            header = {"Su", "Mo", "Tu", "We", "Th", "Fr", "Sa"},
            headers = @FindBy(css = ".dow"),
            cell = @FindBy(css = "tbody>tr>td")
    )
    public Table dates;
}
