package com.advantageshopping.qa.exceptions;

public class ResultNotWaited extends AssertionError {
    public static final String NUMBER_NOT_FOUND = "Number not found";

    public static String getErrorNetworkMessage() {
        return NUMBER_NOT_FOUND;
    }

    public ResultNotWaited(String message, Throwable cause) {
        super(message, cause);
    }
}
