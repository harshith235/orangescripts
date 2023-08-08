import org.example.Logic.MainClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeScripts {

    MainClass mainClass = new MainClass();
    @BeforeTest
    public void beforeTestLaunch() throws InterruptedException {
        mainClass.launch();
    }

//    @Test(priority = 1)
//    public void loginWithInvalidCredentials() throws InterruptedException {
//        mainClass.login("HHHH","admin123");
//    }
//
    @Test(priority = 2)
    public void validLogin() throws InterruptedException {
        mainClass.login("Admin","admin123");
    }

    //@Test(priority = 3)
    //public void admin() throws InterruptedException {
        //mainClass.upCommingMatches();
    }

