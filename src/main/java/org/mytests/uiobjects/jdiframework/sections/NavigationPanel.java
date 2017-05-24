package org.mytests.uiobjects.jdiframework.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mikhail_Churakov on 5/23/2017.
 */
public class NavigationPanel extends Section {
    @FindBy(css = ".profile-photo")
    public Button loginButton;
    @FindBy(css = ".form-horizontal")
    public LoginPanel loginPanel;
    @FindBy(css = ".profile-photo>span")
    public Label userNameLabel;
}
