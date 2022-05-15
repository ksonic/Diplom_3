package tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageobject.MainPage;

import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Selenide.open;
import static pageobject.MainPage.*;

public class ConstructorSectionsTest {
    @BeforeEach
    public void startUp() {
        MainPage mainPage =
                open("https://stellarburgers.nomoreparties.site/",
                        MainPage.class);
    }

    @Test
    @DisplayName("Check transition from to sauces section")
    @Description("Basic ui test for pages transition")
    public void saucesTest(){
        MainPage.saucesSectionClick();
       saucesSection.parent().shouldHave(cssClass("tab_tab_type_current__2BEPc"));
   }

    @Test
    @DisplayName("Check transition from to fillings section")
    @Description("Basic ui test for pages transition")
    public void fillingsTest() {
        MainPage.fillingsSectionClick();
        fillingsSection.parent().shouldHave(cssClass("tab_tab_type_current__2BEPc"));
    }

    @Test
    @DisplayName("Check transition from to buns section")
    @Description("Basic ui test for pages transition")
    public void bunsTest() {
        MainPage.fillingsSectionClick();
        MainPage.bunsSectionClick();
        bunsSection.parent().shouldHave(cssClass("tab_tab_type_current__2BEPc"));
    }
}
