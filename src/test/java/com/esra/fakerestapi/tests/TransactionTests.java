package com.esra.fakerestapi.tests;

import com.esra.fakerestapi.base.BaseTest;
import com.esra.fakerestapi.specifications.RequestSpecifications;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class TransactionTests extends BaseTest {

    @Test
    public void getTransactionsTest() {

        Response response = given()

                .log().all()

                .spec(RequestSpecifications.getRequestSpec())

                .when()
                .get("/transactions");

        response.then()

                .log().all()

                .statusCode(200)
                .time(lessThan(3000L));

        System.out.println("Transaction Test Passed");
    }
}