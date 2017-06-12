package org.mytests.uiobjects.jdiframework.pages.complextablepage;

import com.epam.jdi.uitests.web.selenium.elements.common.Link;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mikhail_Churakov on 5/29/2017.
 */

public class Row extends Section {
    @FindBy(css = ".title-col>span")
    public Link techLabel;
    @FindBy(css = "td")
    public TechCell column1;
    @FindBy(css = "td")
    public TechCell column2;
    //public TechCell column3;
}
