package org.mytests.uiobjects.jdiframework.pages.complextablepage;

import com.epam.jdi.uitests.web.selenium.elements.common.CheckBox;
import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.common.Link;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mikhail_Churakov on 5/29/2017.
 */
public class Column1 {
    @FindBy(css = "label[for='g1']")
    public CheckBox select;
    @FindBy(css = "a")
    public Link seeMore;
    @FindBy(xpath = "p")
    public Label techLabel;
}
