package library;

import io.cucumber.datatable.DataTable;
import io.restassured.response.Response;
import library.user.User;
import library.user.UserFactory;
import org.json.simple.JSONObject;
import org.junit.Assert;
import utils.ApiUtilities;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApiLibrary {

    ApiUtilities apiUtil = new ApiUtilities();

    public void deletePet(String name, String id){

        apiUtil.uri = apiUtil.uri + "/" + id;

        Response response = apiUtil.performApiCall("delete", null);

        if (response.getStatusCode() == 200){
            System.out.println("The pet with id: "+id+" was successfully deleted.");
            apiUtil.contextJSON.put(name, apiUtil.serverResponse);
        }
        else Assert.fail("The server response was unexpectedly "+response.getStatusCode());
    }

    public void postUsers(DataTable dataTable){

        Map<String, User> userMap = new UserFactory(dataTable).getUsers();

        List<JSONObject> users = new ArrayList<>();

        for (String name:userMap.keySet()) { // This creates a JSONObject for each user & puts it into the json object list
            JSONObject user = new JSONObject();
            user.put("id", userMap.get(name).getId());
            user.put("username", userMap.get(name).getUsername());
            user.put("firstName", userMap.get(name).getFirstName());
            user.put("lastName", userMap.get(name).getLastName());
            user.put("email", userMap.get(name).getEmail());
            user.put("password", userMap.get(name).getPassword());
            user.put("phone", userMap.get(name).getPhone());
            user.put("userStatus", userMap.get(name).getUserStatus());

            users.add(user);
        }

        apiUtil.uri = "user/createWithList"; // This sets request URI

        Response response = apiUtil.performApiCall("post", users);

        System.out.println("Response body: ");
        response.prettyPrint();

        if (response.getStatusCode() == 200){
            System.out.println("Users were all succcessfully posted.");
            apiUtil.contextJSON.put("users", apiUtil.serverResponse);
        }
        else Assert.fail("The server response was unexpectedly "+response.getStatusCode());
    }

}
