package utils;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;

import java.io.*;

public class JsonUtilities {

    public void saveJson(JSONObject inputJson, String jsonName){
        try {

            FileWriter file = new FileWriter("src/test/java/resources/database/"+jsonName+".JSON");

            ObjectMapper mapper = new ObjectMapper();

            String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(inputJson);

            if(file.toString().isEmpty())
                file.write(String.valueOf(json));
            else
                file.append(String.valueOf(json));

            file.close();

        }catch (Exception gamma){
            Assert.fail(String.valueOf(gamma));
        }

    }

    public JSONObject str2json(String inputString){
        JSONObject object = null;
        try {

            JSONParser parser = new JSONParser();

            object = (JSONObject) parser.parse(inputString);

        }catch (Exception gamma){
            Assert.fail(String.valueOf(gamma));
        }
        return object;
    }

}
