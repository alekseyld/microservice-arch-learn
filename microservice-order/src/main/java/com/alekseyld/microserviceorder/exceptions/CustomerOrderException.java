package com.alekseyld.microserviceorder.exceptions;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

public class CustomerOrderException extends AbstractThrowableProblem {
    public CustomerOrderException(final String uuid, final String reason) {
        super(
                ErrorConstants.CUSTOMER_MICROSERVICE,
                "Customer Microservice Error",
                Status.INTERNAL_SERVER_ERROR,
                String.format("For Order UUID: %s, Customer Microservice Messageg: %s", uuid, reason)
        );
    }

    public CustomerOrderException(final String uuid, final int response) {
        super(
                ErrorConstants.CUSTOMER_MICROSERVICE,
                "Customer Microservice Bad Request",
                Status.BAD_REQUEST,
                String.format("For Order UUID: %s, Customer Microservice Response: %d", uuid, response)
        );
    }
}
