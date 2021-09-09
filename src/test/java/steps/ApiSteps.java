package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import library.ApiLibrary;

public class ApiSteps {

    ApiLibrary api = new ApiLibrary();

    @Given("I delete pet {} which has {} id number.")
    public void iClickToSubmitButton(String name,String id) {api.deletePet(name,id);}

    @Given("I post user(s) as:")
    public void createUser(DataTable dataTable){api.postUsers(dataTable);}

}
