package steps;

import io.cucumber.java.en.Given;
import library.ApiLibrary;

public class ApiSteps {

    ApiLibrary api = new ApiLibrary();

    @Given("I delete pet {} which has {} id number.")
    public void iClickToSubmitButton(String name,String id) {api.deletePet(name,id);}

}