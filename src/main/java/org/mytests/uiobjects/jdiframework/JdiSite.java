package org.mytests.uiobjects.jdiframework;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import org.mytests.uiobjects.jdiframework.pages.*;
import org.mytests.uiobjects.jdiframework.pages.complextablepage.ComplexTablePage;
import org.mytests.uiobjects.jdiframework.sections.NavigationPanel;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mikhail_Churakov on 5/23/2017.
 */
@JSite(domain = "https://jdi-framework.github.io/tests/")
public class JdiSite extends WebSite{
    @JPage(url = "/index.htm", title = "Index Page")
    public static HomePage homePage;
    @JPage(url = "/page1.htm", title = "Contact Form")
    public static ContactFormPage contactFormPage;
    @FindBy(css = "nav[role='navigation']")
    public static NavigationPanel navigationPanel;
    @JPage(url = "/page4.htm", title = "Dates")
    public static DatesPage datesPage;
    @JPage(url = "/page6.htm", title = "Simple Table")
    public static SimpleTablePage simpleTablePage;
    @JPage(url = "/page5.htm", title = "Complex Table")
    public static ComplexTablePage complexTablePage;
}
