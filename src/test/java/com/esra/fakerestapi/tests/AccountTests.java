package com.esra.fakerestapi.tests;

import com.esra.fakerestapi.base.BaseTest;
import com.esra.fakerestapi.specifications.RequestSpecifications;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class AccountTests extends BaseTest {

    @Test
    public void getAccountsTest() {

        Response response = given()

                .log().all()

                .spec(RequestSpecifications.getRequestSpec())

                .when()
                .get("/accounts");

        response.then()

                .log().all()

                .statusCode(200)
                .time(lessThan(3000L));

        System.out.println("Get Accounts Test Passed");
    }
}