package org.mytests.uiobjects.jdiframework;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import org.mytests.uiobjects.jdiframework.pages.ContactFormPage;
import org.mytests.uiobjects.jdiframework.pages.HomePage;
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


}
