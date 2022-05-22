package tests;

import helper.MainPageBase;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static pageobject.MainPage.*;

public class ConstructorSectionsTest extends MainPageBase {

    @Test
    @DisplayName("Check transition from to sauces section")
    @Description("Basic ui test for pages transition")
    public void saucesTest() {
        mainPage.saucesSectionClick();
        mainPage.sectionCheck(saucesSection);
    }

    @Test
    @DisplayName("Check transition from to fillings section")
    @Description("Basic ui test for pages transition")
    public void fillingsTest() {
        mainPage.fillingsSectionClick();
        mainPage.sectionCheck(fillingsSection);
    }

    @Test
    @DisplayName("Check transition from to buns section")
    @Description("Basic ui test for pages transition")
    public void bunsTest() {
        mainPage.fillingsSectionClick();
        mainPage.bunsSectionClick();
        mainPage.sectionCheck(bunsSection);
    }

}
