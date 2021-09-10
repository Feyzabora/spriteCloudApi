package library;

import com.google.gson.JsonObject;
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

    public void getUser(String username){

        apiUtil.uri = "user/"+username;

        Response response = apiUtil.performApiCall("get", null);

        System.out.println("The response body:");
        response.prettyPrint();

        if (response.getStatusCode() == 200){
            System.out.println("The user "+username+" was successfully fetched.");
            apiUtil.contextJSON.put(username, apiUtil.serverResponse);
        }
        else Assert.fail("The server response was unexpectedly "+response.getStatusCode());
    }

    public void login(String username, String password){

        apiUtil.uri = "user/login?username="+username+"&password="+password;
        System.out.println(apiUtil.uri);

        Response response = apiUtil.performApiCall("get", null);

        System.out.println("The response body:");
        response.prettyPrint();

        if (response.getStatusCode() == 200){
            System.out.println("The user logged in successfully.");
            apiUtil.contextJSON.put(username, apiUtil.serverResponse);
        }
        else Assert.fail("The server response was unexpectedly "+response.getStatusCode());
    }

    public void logout(String username){

        apiUtil.uri = "user/logout";
        System.out.println(apiUtil.uri);

        Response response = apiUtil.performApiCall("get", null);

        System.out.println("The response body:");
        response.prettyPrint();

        if (response.getStatusCode() == 200){
            System.out.println("The user " + username + "logged out successfully.");
            apiUtil.contextJSON.put(username, apiUtil.serverResponse);
        }
        else Assert.fail("The server response was unexpectedly "+response.getStatusCode());
    }

    public void updateInfo(DataTable dataTable){

        Map<String, User> userMap = new UserFactory(dataTable).getUsers();

        for (String name : userMap.keySet()) { // This creates a JSONObject for each user & puts it into the json object list
            JSONObject user = new JSONObject();
            user.put("id", userMap.get(name).getId());
            user.put("username", userMap.get(name).getUsername());
            user.put("firstName", userMap.get(name).getFirstName());
            user.put("lastName", userMap.get(name).getLastName());
            user.put("email", userMap.get(name).getEmail());
            user.put("password", userMap.get(name).getPassword());
            user.put("phone", userMap.get(name).getPhone());
            user.put("userStatus", userMap.get(name).getUserStatus());

            apiUtil.uri = "user/"+userMap.get(name).getUsername(); // This sets request URI

            Response response = apiUtil.performApiCall("put", user);

            System.out.println("Response body: ");
            response.prettyPrint();

            if (response.getStatusCode() == 200) {
                System.out.println("Users were all successfully updated.");
                apiUtil.contextJSON.put("users", apiUtil.serverResponse);
            } else Assert.fail("The server response was unexpectedly " + response.getStatusCode());
        }

    }

    public void deleteUser(String username){

        apiUtil.uri = "user/"+username;

        Response response = apiUtil.performApiCall("delete", null);

        System.out.println("The response body:");
        response.prettyPrint();

        if (response.getStatusCode() == 200){
            System.out.println("The user "+username+" was successfully deleted.");
            apiUtil.contextJSON.put(username, apiUtil.serverResponse);
        }
        else Assert.fail("The server response was unexpectedly "+response.getStatusCode());
    }

    public void postUser(DataTable dataTable) {

        Map<String, User> userMap = new UserFactory(dataTable).getUsers();

        for (String name : userMap.keySet()) { // This creates a JSONObject for each user & puts it into the json object list
            JSONObject user = new JSONObject();
            user.put("id", userMap.get(name).getId());
            user.put("username", userMap.get(name).getUsername());
            user.put("firstName", userMap.get(name).getFirstName());
            user.put("lastName", userMap.get(name).getLastName());
            user.put("email", userMap.get(name).getEmail());
            user.put("password", userMap.get(name).getPassword());
            user.put("phone", userMap.get(name).getPhone());
            user.put("userStatus", userMap.get(name).getUserStatus());


            apiUtil.uri = "user/"; // This sets request URI

            Response response = apiUtil.performApiCall("post", user);

            System.out.println("Response body: ");
            response.prettyPrint();

            if (response.getStatusCode() == 200) {
                System.out.println("User was succcessfully posted.");
                apiUtil.contextJSON.put("users", apiUtil.serverResponse);
            } else Assert.fail("The server response was unexpectedly " + response.getStatusCode());
        }

    }



    public void postUsersList(DataTable dataTable){

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

    public void postUsersArray(DataTable dataTable){

        Map<String, User> userMap = new UserFactory(dataTable).getUsers();

        ArrayList<JSONObject> users = new ArrayList<>();

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

        apiUtil.uri = "user/createWithArray"; // This sets request URI

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
