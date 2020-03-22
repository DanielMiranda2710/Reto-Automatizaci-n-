package com.advantageshopping.qa.tasks;
import static com.advantageshopping.qa.userinterfaces.AdvantageShoppingHome.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Log implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MENU_USER),
                Enter.theValue("dmiranda27").into(USERNAME),
                Enter.theValue("Contra123+").into(PASSWORD),
                Click.on(SIGN_IN_BUTTON));
    }

    public static Log in(){
        return instrumented(Log.class);
    }
}
