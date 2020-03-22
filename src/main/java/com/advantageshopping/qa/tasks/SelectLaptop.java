package com.advantageshopping.qa.tasks;
import static com.advantageshopping.qa.userinterfaces.AdvantageShoppingBuy.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import cucumber.api.java.eo.Se;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import com.advantageshopping.qa.utils.Utilities;
public class SelectLaptop implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElementFacade random = Utilities.listProducts(actor);
        actor.attemptsTo(Click.on(random),
                Click.on(ADD_TO_CART),
                Click.on(MENU_CART));
    }

    public static SelectLaptop add(){
        return instrumented(SelectLaptop.class);
    }
}
