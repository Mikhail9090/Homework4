package org.mytests.uiobjects.jdiframework.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mikhail_Churakov on 5/28/2017.
 */
public class Log extends Section {
    @FindBy(xpath = "//ul[@class='panel-body-list logs']//li[1]")
    public Label lastLogData;
}
