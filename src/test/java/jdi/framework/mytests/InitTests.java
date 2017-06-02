package jdi.framework.mytests;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import org.mytests.uiobjects.jdiframework.JdiSite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.mytests.uiobjects.jdiframework.JdiSite.homePage;

/**
 * Created by Mikhail_Churakov on 5/31/2017.
 */
public class InitTests extends TestNGBase {
    @BeforeSuite
    public void setUp() {
        WebSite.init(JdiSite.class);
    }

    @BeforeTest
    public void openHost() {
        homePage.open();
    }

    public String getCurrentTime() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
