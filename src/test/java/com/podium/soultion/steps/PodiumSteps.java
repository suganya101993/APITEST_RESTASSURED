package com.podium.soultion.steps;

import com.podium.soultion.tests.PodiumTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.lang3.StringUtils;
import org.hamcrest.Matchers;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class PodiumSteps {

    private RequestSpecification request;
    private Response response;
    private ResponseBody body;
    private ValidatableResponse json;
    private PodiumTest podiumTest;

    public PodiumSteps() {
        podiumTest = new PodiumTest();
    }


    @When("I retrieve mortgage details (.*)")
    public void getpodiumTestDetails(String Url) {
        request = given().contentType("application/json").log().all();
        response = request.when().get(Url);
    }

    @Then("I should successfully be able to view the retrieved mortgage details")
    public void verifyPodiumTestDetails(Map<String, String> responseElements) {
        json = response.then().assertThat().statusCode(200).log().ifValidationFails().log().ifError();
        for (Map.Entry<String, String> field : responseElements.entrySet()) {
            if (StringUtils.isNumeric(field.getValue())) {
                json.assertThat().body(field.getKey(), Matchers.hasItem(Matchers.hasToString(String.valueOf(Integer.parseInt(field.getValue()))))).log().ifError().log().ifValidationFails();
            } else {
                json.assertThat().body(field.getKey(), Matchers.hasItem(Matchers.hasToString(field.getValue()))).log().ifError().log().ifValidationFails();
            }
        }
    }

    @Given("I am a new mortgage applicant")
    public void newMortgageApplicant() {
        request = given().contentType("application/json").log().all();
    }

    @When("I submit my mortgage application")
    public void submitMortgageApplication() {
        podiumTest.mortgageApplicationReqBody();
        request.body(podiumTest.requestParams.toString());
        response = request.when().post("https://podium-slns-interview.getsandbox.com/products/" + podiumTest.productId + "/applications");
    }

    @Then("I should be able  to successfully submit my mortgage application")
    public void verifySubmissionOfMortgageApplication() {
        json = response.then().assertThat().statusCode(201).log().ifValidationFails().log().ifError();
    }
}
