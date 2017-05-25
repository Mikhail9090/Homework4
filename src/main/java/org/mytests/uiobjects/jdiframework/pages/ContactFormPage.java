package org.mytests.uiobjects.jdiframework.pages;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.mytests.uiobjects.jdiframework.sections.Result;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mikhail_Churakov on 5/23/2017.
 */
public class ContactFormPage extends WebPage {
    @FindBy(id = "Name")
    public TextField name;
    @FindBy(id = "LastName")
    public TextField lastName;
    @FindBy(id = "Description")
    public TextField description;
    @FindBy(css = ".col-sm-6>button[type='submit']")
    public Button submit;
    @FindBy(css = ".info-panel-body-result")
    public Result resultForm;
}
