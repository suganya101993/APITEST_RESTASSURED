package com.podium.soultion.tests;
import com.mifmif.common.regex.Generex;
import org.json.JSONObject;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class PodiumTest {

    public JSONObject requestParams;
    private Generex generex;
    private Random random;

    public PodiumTest() {
        requestParams = new JSONObject();
        random = new Random();
    }

    String name = generateRandomString("[A-Z]{6}");
    int mortgageAmount = generateRandomInteger("[0-9]{4}");
    int propertyValue = generateRandomInteger("[0-9]{5}");
    public String productId = generateRandomString("[0-9]{5}");

    public void mortgageApplicationReqBody() {
        requestParams.put("name", name);
        requestParams.put("age", 20);
        requestParams.put("mortgageAmount", mortgageAmount);
        requestParams.put("propertyValue", propertyValue);
    }

    //    generates a random String
    public String generateRandomString(String regex) {
        generex = new Generex(regex);
        return generex.random();
    }

    //    generates a random String
    public int generateRandomInteger(String regex) {
        generex = new Generex(regex);
        return Integer.parseInt(generex.random());
    }

}
