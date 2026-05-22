package com.esra.fakerestapi.base;

import com.esra.fakerestapi.utils.ConfigReader;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass
    public void setup() {

        RestAssured.baseURI =
                ConfigReader.getProperty("base.url");
    }
}