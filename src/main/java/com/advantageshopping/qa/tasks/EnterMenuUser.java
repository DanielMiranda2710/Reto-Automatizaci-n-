package com.advantageshopping.qa.tasks;

import static com.advantageshopping.qa.userinterfaces.AdvantageShoppingHome.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class EnterMenuUser implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MENU_USER));
    }

    public static EnterMenuUser open(){
        return instrumented(EnterMenuUser.class);
    }
}
