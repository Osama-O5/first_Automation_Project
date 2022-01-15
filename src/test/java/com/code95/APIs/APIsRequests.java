package com.code95.APIs;

import Utils.PropertiesReader;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class APIsRequests {
    static PropertiesReader propertiesReader = new PropertiesReader();

    @Test
    public static void getALLUsers(){
        RestAssured.baseURI = propertiesReader.getAPIUrl();
        Response getAlluser = given().
                relaxedHTTPSValidation()
                .header("Content-Type" , "application/json")
                .when()
                .get()
                .then()
                .assertThat()
                .statusCode(200)
                .log()
                .body()
                .extract()
                .response();

        String result = getAlluser.asString();
        System.out.println(result);

    }


    @Test
    public static void getuserByID(){
        RestAssured.baseURI = "https://reqres.in/api/user/2";
        Response getuserByID = given().
                relaxedHTTPSValidation()
                .header("Content-Type" , "application/json")
                .when()
                .get()
                .then()
                .assertThat()
                .statusCode(200)
                .log()
                .body()
                .extract()
                .response();

        String result = getuserByID.asString();
        System.out.println(result);

    }


    @Test
    public static void createUser(){
        RestAssured.baseURI = propertiesReader.getAPIUrl();
        Response createUser = given().
                relaxedHTTPSValidation()
                .header("Content-Type" , "application/json")
                .when()
                .body("{\n" +
                        "    \"name\": \"Ali\",\n" +
                        "    \"job\": \"Automation Engineer\"\n" +
                        "}")
                .post()
                .then()
                .assertThat()
                .statusCode(201)
                .log()
                .body()
                .extract()
                .response();

        String result = createUser.asString();
        System.out.println(result);

    }


    @Test
    public static void updateUser(){
        RestAssured.baseURI = "https://reqres.in/api/user/215";
        Response updateUser = given().
                relaxedHTTPSValidation()
                .header("Content-Type" , "application/json")
                .when()
                .body("{\n" +
                        "    \"name\": \"Ahmed\",\n" +
                        "    \"job\": \"senior Automation Engineer \"\n" +
                        "}")
                .put()
                .then()
                .assertThat()
                .statusCode(200)
                .log()
                .body()
                .extract()
                .response();

        String result = updateUser.asString();
        System.out.println(result);

    }

    @Test
    public static void deleteUser(){
        RestAssured.baseURI = "https://reqres.in/api/user/215";
        Response deleteUser = given().
                relaxedHTTPSValidation()
                .header("Content-Type" , "application/json")
                .when()
                .delete()
                .then()
                .assertThat()
                .statusCode(204)
                .log()
                .body()
                .extract()
                .response();

        String result = deleteUser.asString();
        System.out.println(result);

    }
}
