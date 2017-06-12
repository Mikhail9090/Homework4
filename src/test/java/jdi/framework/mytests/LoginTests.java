package jdi.framework.mytests;

import com.epam.web.matcher.junit.Assert;
import org.mytests.uiobjects.jdiframework.dataproviders.UserProvider;
import org.mytests.uiobjects.jdiframework.entities.User;
import org.testng.annotations.Test;

import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.isInState;
import static org.mytests.enums.States.LOGGED_IN;
import static org.mytests.enums.States.LOGGED_OUT;
import static org.mytests.uiobjects.jdiframework.JdiSite.homePage;

/**
 * Created by Mikhail_Churakov on 5/31/2017.
 */
public class LoginTests extends InitTests {
    @Test(dataProvider = "users", dataProviderClass = UserProvider.class)
    public void login(User user) {
        isInState(LOGGED_OUT);
        homePage.login(user);
        Assert.isTrue(homePage.isLoggedIn());
    }

    @Test
    public void logout() {
        isInState(LOGGED_IN);
        homePage.logout();
        Assert.isFalse(homePage.isLoggedIn());
    }
    @Test(dataProvider = "badUsers", dataProviderClass = UserProvider.class)
    public void negativeLogin(User user) {
        isInState(LOGGED_OUT);
        homePage.login(user);
        Assert.isTrue(homePage.navigationPanel.loginPanel.errorMessage.isDisplayed());
        Assert.isFalse(homePage.isLoggedIn());
    }
}
