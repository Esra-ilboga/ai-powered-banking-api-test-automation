package com.esra.fakerestapi.tests;

import com.esra.fakerestapi.base.BaseTest;
import com.esra.fakerestapi.models.Customer;
import com.esra.fakerestapi.specifications.RequestSpecifications;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class CustomerTests extends BaseTest {

    @Test
    public void createCustomerTest() {

        Customer customer =
                new Customer(
                        "Esra",
                        "Deneme",
                        "esra@gmail.com"
                );

        Response response = given()

                .log().all()

                .spec(RequestSpecifications.getRequestSpec())
                .body(customer)

                .when()
                .post("/customers");

        response.then()

                .log().all()

                .statusCode(200)
                .time(lessThan(3000L));

        System.out.println("Customer Create Test Passed");
    }

    @Test
    public void getCustomerTest() {

        Response response = given()

                .log().all()

                .spec(RequestSpecifications.getRequestSpec())

                .when()
                .get("/customers");

        response.then()

                .log().all()

                .statusCode(200)
                .time(lessThan(3000L));

        System.out.println("Get Customer Test Passed");
    }

    @Test
    public void getNonExistingCustomerTest() {

        Response response = given()

                .log().all()

                .spec(RequestSpecifications.getRequestSpec())

                .when()
                .get("/customers/999999");

        response.then()

                .log().all()

                .time(lessThan(3000L));

        System.out.println("Negative Endpoint Test Executed");
        System.out.println("Returned Status Code: " + response.getStatusCode());
    }
}