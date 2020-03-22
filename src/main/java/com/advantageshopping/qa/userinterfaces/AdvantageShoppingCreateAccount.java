package com.advantageshopping.qa.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AdvantageShoppingCreateAccount {
    public static final Target USERNAME = Target.the("username").located(By.name("usernameRegisterPage"));
    public static final Target EMAIL = Target.the("email").located(By.name("emailRegisterPage"));
    public static final Target PASSWORD = Target.the("password").located(By.name("passwordRegisterPage"));
    public static final Target CONFIRM_PASSWORD = Target.the("confirmPassword").located(By.name("confirm_passwordRegisterPage"));
    public static final Target FIRST_NAME = Target.the("firstName").located(By.name("first_nameRegisterPage"));
    public static final Target LAST_NAME = Target.the("lastName").located(By.name("last_nameRegisterPage"));
    public static final Target PHONE_NUMBER = Target.the("phoneNumber").located(By.name("phone_numberRegisterPage"));
    public static final Target COUNTRY = Target.the("country").located(By.name("countryListboxRegisterPage"));
    public static final Target COLOMBIA = Target.the("colombia").located(By.xpath("//*[@name='countryListboxRegisterPage']//option[@label='Colombia']"));
    public static final Target CITY = Target.the("city").located(By.name("cityRegisterPage"));
    public static final Target ADDRESS = Target.the("address").located(By.name("addressRegisterPage"));
    public static final Target STATE = Target.the("state").located(By.name("state_/_province_/_regionRegisterPage"));
    public static final Target POSTAL_CODE = Target.the("postalCode").located(By.name("postal_codeRegisterPage"));
    public static final Target AGREE = Target.the("agree").located(By.name("i_agree"));
    public static final Target REGISTER_BUTTON = Target.the("registerButton").located(By.id("register_btnundefined"));

}
