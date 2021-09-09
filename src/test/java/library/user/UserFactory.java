package library.user;

import io.cucumber.datatable.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserFactory {

    private final Map<String, User> users;

    public UserFactory(DataTable table){

        List<Map<String, String>> userMapList = table.asMaps();

        Map<String, User> users = new HashMap<>();

        User user;

        for (Map<String, String> userMap : userMapList) { //This converts the data to a map of user instances
            user = new User(
                    Integer.parseInt(userMap.get("ID")),Integer.parseInt(userMap.get("Status")),
                    userMap.get("First Name"), userMap.get("Last Name"),userMap.get("Email"),
                    userMap.get("Password"), userMap.get("Phone"),userMap.get("Username")
            );

            users.put(userMap.get("First Name"), user);
        }
        this.users = users;
    }

    public Map<String, User> getUsers(){return users;}
}
