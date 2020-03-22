package com.advantageshopping.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

public class AdvantageShoppingHome {
    public static final Target MENU_USER = Target.the("menuUser").located(By.id("menuUser"));
    public static final Target CREATE_NEW_ACCOUNT = Target.the("createNewAccount").located(By.xpath("//a[@class='create-new-account ng-scope']"));
    public static final Target NAVBAR_USERNAME = Target.the("navbarUsername").located(By.xpath("//*[@class='hi-user containMiniTitle ng-binding']"));
    public static final Target USERNAME = Target.the("username").located(By.name("username"));
    public static final Target PASSWORD = Target.the("password").located(By.name("password"));
    public static final Target SIGN_IN_BUTTON = Target.the("signInButton").located(By.id("sign_in_btnundefined"));
    public static final Target MENU_SEARCH = Target.the("menuSearch").located(By.id("menuSearch"));
    public static final Target SEARCH_BAR = Target.the("searchBar").located(By.id("autoComplete"));
    public static final Target CLOSE_BAR = Target.the("closeBar").located(By.xpath("//div[@data-ng-click='closeSearchForce()']"));
}
