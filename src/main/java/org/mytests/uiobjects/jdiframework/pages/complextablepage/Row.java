package org.mytests.uiobjects.jdiframework.pages.complextablepage;

import com.epam.jdi.uitests.web.selenium.elements.common.Link;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mikhail_Churakov on 5/29/2017.
 */

public class Row {
    @FindBy(css = "//tr//td[@class='title-col']")
    public Link techDescription;
    @FindBy(xpath = "//tr//td[2]")
    public Column1 column1;
    @FindBy(xpath = "//tr//td[3]")
    public Column2 column2;
    @FindBy(xpath = "//tr//td[4]")
    public Column3 column3;
}
