package com.alekseyld.microserviceorder.exceptions;

import java.net.URI;

public final class ErrorConstants {

    public static final URI CUSTOMER_MICROSERVICE = URI.create("customer-order-problem");

    private ErrorConstants() {
    }
}