package org.mytests.uiobjects.jdiframework.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import com.epam.jdi.uitests.web.selenium.elements.complex.Menu;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import org.mytests.enums.NavigationMenu;
import org.mytests.enums.ServiceMenu;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mikhail_Churakov on 5/23/2017.
 */
public class NavigationPanel extends Section {
    @FindBy(css = ".profile-photo")
    public Button expandLoginPanel;
    @FindBy(css = ".form-horizontal")
    public LoginPanel loginPanel;
    @FindBy(css = ".profile-photo>span")
    public Label userNameLabel;
    @FindBy(css = "nav[role='navigation']>ul>li>a")
    public Menu<NavigationMenu> navigationMenu;
    @FindBy(css = ".fa-sign-out")
    public Button signOut;
    @FindBy(css = ".dropdown-menu>li")
    public Menu<ServiceMenu> serviceMenu;
    @FindBy(css = ".dropdown-toggle[href='page1.htm']")
    public Dropdown<ServiceMenu> serviceMenuDropdown;


}
