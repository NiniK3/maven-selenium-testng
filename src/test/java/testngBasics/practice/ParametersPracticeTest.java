package testngBasics.practice;


import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersPracticeTest {

    /* To pass a parameter from xml to our test case we will need to define here another annotation
    * @Parameters(), inside of the annotation we will specify what is the name of the parameter we want to use
    *
    * In some cases the parameter would not be available in xml for some reason
    * However, we still need our test case to be working
    * TestNG provides a workaround for it with @Optional annotation
    * We provide what would be the default value of the parameter if the original one is not available
    * The logic here will be:
    * If the parameter is available (we run the case from xml) then it will execute the test case with parameter provided from xml
    * Otherwise, if the parameter is not available from xml (we run it directly from the IntelliJ) then the Optional value will be utilized.
    * */
    @Parameters("parameterTwo")
    @Test
    public void testParametersFromXml(@Optional("this is optional") String param1){
        //String someVariable = "Data from variable..."; // hard coded
        System.out.println(param1);
    }

    /* We also can have as many parameters as we need
    * Here we can see an example of passing two parameters from xml
    * Note: all the data passed from xml will be a text/string
    * If you need to utilize other data types e.g. int, bool etc..
    * use java methods to parse string to whatever data type you need
    * */

    @Parameters({"username", "password"})
    @Test
    public void testMultipleParameters(String user, String pass){
        System.out.println(user);
        System.out.println(pass);
    }


}
