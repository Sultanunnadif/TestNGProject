package stepdef;


import basewebsite.foundation;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.annotations.Test;

import java.io.File;

public class stepHooks extends foundation {
    @Before
    public void beforeTest(){
        driverGet();
    }
    @After
    public void afterTest(){
        driver.close();
    }
}
