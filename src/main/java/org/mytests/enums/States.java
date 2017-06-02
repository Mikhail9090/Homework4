package org.mytests.enums;


import com.epam.commons.linqinterfaces.JAction;
import com.epam.jdi.uitests.core.preconditions.IPreconditions;
import com.google.common.base.Supplier;
import org.mytests.uiobjects.jdiframework.pages.HomePage;

import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.alwaysMoveToCondition;
import static org.mytests.uiobjects.jdiframework.JdiSite.homePage;

/**
 * Created by Mikhail_Churakov on 5/31/2017.
 */
public class States implements IPreconditions {
    LOGGED_IN(() -> homePage.isLoggedIn(),
            () -> homePage.login()),
    LOGGED_OUT(() ->homePage.isLoggedIn(),
            () -> homePage.logout());

    public Supplier<Boolean> checkAction;
    public JAction moveToAction;

    States(Supplier<Boolean> checkAction, JAction moveToAction) {
        this.checkAction = checkAction;
        this.moveToAction = moveToAction;
        alwaysMoveToCondition = true;
    }

    public Boolean checkAction() {
        return checkAction.get();
    }

    public void moveToAction() {
        moveToAction.invoke();
    }
}
