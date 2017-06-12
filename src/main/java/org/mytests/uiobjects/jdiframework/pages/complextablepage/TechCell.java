package org.mytests.uiobjects.jdiframework.pages.complextablepage;

import com.epam.jdi.uitests.core.interfaces.common.ICheckBox;
import com.epam.jdi.uitests.core.interfaces.common.IText;
import com.epam.jdi.uitests.web.selenium.elements.common.Link;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mikhail_Churakov on 6/11/2017.
 */
public class TechCell extends Section {
    @FindBy(css = "input[type=checkbox]")
    public ICheckBox select;
    @FindBy(css = ".seeMore")
    public Link seeMore;
    @FindBy(css = "tr p:not(.checkbox)")
    public IText title;
}
