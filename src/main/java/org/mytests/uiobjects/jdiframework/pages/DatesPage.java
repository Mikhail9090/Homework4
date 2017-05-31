package org.mytests.uiobjects.jdiframework.pages;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.mytests.uiobjects.jdiframework.sections.Log;
import org.mytests.uiobjects.jdiframework.sections.datespage.TimePickerWidget;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mikhail_Churakov on 5/28/2017.
 */
public class DatesPage extends WebPage {
    @FindBy(css = ".fa-clock-o")
    public Button timeButton;
    @FindBy(css = ".bootstrap-timepicker-widget>table")
    public TimePickerWidget timePicker;
    @FindBy(css = ".info-panel-body-log")
    public Log logPanel;
    @FindBy(css = ".fa-calendar")
    public Button dateButton;
    @FindBy(id = "timepicker")
    public TextField timeInput;
}
