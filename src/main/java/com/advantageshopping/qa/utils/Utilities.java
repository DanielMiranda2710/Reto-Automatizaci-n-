package com.advantageshopping.qa.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.util.List;

public class Utilities {

    public void timeout(int time) throws InterruptedException{
        Thread.sleep(time);
    }

    public static WebElementFacade listProducts(Actor actor) {
        List<WebElementFacade> listElements = BrowseTheWeb.as(actor).findAll("//ul//li[@ng-repeat]");
        int position = (int) (Math.random()*listElements.size());
        return listElements.get(position);
    }
}
