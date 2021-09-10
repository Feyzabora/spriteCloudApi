package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import library.ApiLibrary;

public class ApiSteps {

    ApiLibrary api = new ApiLibrary();

    @Given("I post a user as:")
    public void createUser(DataTable dataTable){api.postUser(dataTable);}

    @Given("I post user(s) as list:")
    public void createUserList(DataTable dataTable){api.postUsersList(dataTable);}

    @Given("I post user(s) as an array list:")
    public void createUserArray(DataTable dataTable){api.postUsersArray(dataTable);}

    @Given("I get user named {}")
    public void getUser(String userName){api.getUser(userName);}

    @Given("I logged with user {} and password {}")
    public void loginWithUsernameAndPassword(String userName, String password){api.login(userName,password);}

    @Given("I delete user named {}")
    public void deleteUser(String userName){api.deleteUser(userName);}

    @Given("I update users:")
    public void updateData (DataTable dataTable){api.updateInfo(dataTable);}

    @Given("User {} logs out")
    public void logoutFromTheAccount(String userName){api.logout(userName);}


}
