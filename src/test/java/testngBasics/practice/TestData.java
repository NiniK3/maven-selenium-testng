package testngBasics.practice;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "invalidLoginCredentialsDataSet")
    public Object[][] invalidLoginCredentials(){
        return new Object[][] {
                {"invalid", "invalid", "Invalid credentials"},//invalid cders
                {"", "invalid", "Username cannot be empty"}, //empty username
                {"yoll-student", "", "Password cannot be empty"},//empty pass
                {"", "", "Username cannot be empty"},//both empty
                {"yoll-student", "invalid", "Invalid credentials"},//valid login but inv password
        };
    }

}
