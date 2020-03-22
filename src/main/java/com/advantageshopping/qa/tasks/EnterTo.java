package com.advantageshopping.qa.tasks;
import static com.advantageshopping.qa.userinterfaces.AdvantageShoppingHome.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.advantageshopping.qa.userinterfaces.AdvantageShoppingHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class EnterTo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CREATE_NEW_ACCOUNT));
    }

    public static EnterTo create(){
        return instrumented(EnterTo.class);
    }
}
