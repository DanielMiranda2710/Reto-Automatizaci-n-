package com.advantageshopping.qa.tasks;

import static com.advantageshopping.qa.userinterfaces.AdvantageShoppingCreateAccount.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FillForm implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("dmiranda27").into(USERNAME),
                Enter.theValue("danielmiranda47@gmail.com").into(EMAIL),
                Enter.theValue("Contra123+").into(PASSWORD),
                Enter.theValue("Contra123+").into(CONFIRM_PASSWORD),
                Enter.theValue("Daniel").into(FIRST_NAME),
                Enter.theValue("Miranda").into(LAST_NAME),
                Enter.theValue("3196677212").into(PHONE_NUMBER),
                Click.on(COUNTRY),
                Click.on(COLOMBIA),
                Enter.theValue("Medellín").into(CITY),
                Enter.theValue("Cra. 43A # 5A – 113").into(ADDRESS),
                Enter.theValue("poblado").into(STATE),
                Enter.theValue("050021").into(POSTAL_CODE),
                Click.on(AGREE), Click.on(REGISTER_BUTTON)
        );
    }

    public static FillForm register(){
        return instrumented(FillForm.class);
    }
}
