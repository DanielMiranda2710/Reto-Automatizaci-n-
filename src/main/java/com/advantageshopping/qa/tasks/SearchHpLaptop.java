package com.advantageshopping.qa.tasks;

import static com.advantageshopping.qa.userinterfaces.AdvantageShoppingHome.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchHpLaptop implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MENU_SEARCH),
                Enter.theValue("Laptop").into(SEARCH_BAR),
                Click.on(MENU_SEARCH),
                Click.on(CLOSE_BAR));
    }

    public static SearchHpLaptop select(){
        return instrumented(SearchHpLaptop.class);
    }
}
