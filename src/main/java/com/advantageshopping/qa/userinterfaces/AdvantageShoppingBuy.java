package com.advantageshopping.qa.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AdvantageShoppingBuy {
    public static final Target ADD_TO_CART = Target.the("addToCart").located(By.name("save_to_cart"));
    public static final Target MENU_CART = Target.the("menuCart").located(By.id("menuCart"));
    public static final Target AGGREGATE_PURCHASE = Target.the("aggregatePurchase").located(By.xpath("//h3//span[@class='ng-binding']"));
}
