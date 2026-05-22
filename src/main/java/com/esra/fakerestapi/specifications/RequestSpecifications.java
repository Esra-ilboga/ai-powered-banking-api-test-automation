package com.esra.fakerestapi.specifications;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpecifications {

    public static RequestSpecification getRequestSpec() {

        return new RequestSpecBuilder()
                .setContentType("application/json")
                .build();
    }
}