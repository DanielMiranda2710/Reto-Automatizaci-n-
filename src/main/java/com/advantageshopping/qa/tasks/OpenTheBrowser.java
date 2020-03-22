package com.advantageshopping.qa.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.advantageshopping.qa.userinterfaces.AdvantageShoppingUrl;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheBrowser implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(new AdvantageShoppingUrl()));
    }

    public static OpenTheBrowser on(){
        return instrumented(OpenTheBrowser.class);
    }
}
