package com.advantageshopping.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class TheElement implements Question<Boolean> {

    private Target element;

    public TheElement(Target element){
        this.element = element;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(element, WebElementStateMatchers.isVisible());
        return element.resolveFor(actor).isVisible();
    }

    public static TheElement exists(Target element){
        return new TheElement(element);
    }
}
