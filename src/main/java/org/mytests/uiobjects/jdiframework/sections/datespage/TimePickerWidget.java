package org.mytests.uiobjects.jdiframework.sections.datespage;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.TextArea;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mikhail_Churakov on 5/28/2017.
 */
public class TimePickerWidget extends Section {
    @FindBy(css = "[data-action='incrementHour']>.fa-chevron-up")
    public Button incrementHour;
    @FindBy(css = "[data-action='incrementMinute']>.fa-chevron-up")
    public Button incrementMinute;
    @FindBy(css = ".meridian-column")
    public Button changeMeridian;
    @FindBy(css = "[data-action='decrementHour']>.fa-chevron-down")
    public Button decrementHour;
    @FindBy(css = "[data-action='decrementMinute']>.fa-chevron-down")
    public Button decrementMinute;
    @FindBy(css = ".bootstrap-timepicker-hour")
    public TextArea hourInput;
    @FindBy(css = ".bootstrap-timepicker-minute")
    public TextArea minuteInput;
    @FindBy(css = ".bootstrap-timepicker-meridian")
    public TextArea meridianInput;
}
