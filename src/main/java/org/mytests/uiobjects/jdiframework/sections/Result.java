package org.mytests.uiobjects.jdiframework.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mikhail_Churakov on 5/25/2017.
 */
public class Result extends Section{
    @FindBy(css = ".name-res")
    public Label name;
    @FindBy(css = ".lname-res")
    public Label lastName;
    @FindBy(css = ".descr-res")
    public Label description;
}
