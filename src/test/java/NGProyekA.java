import org.testng.Assert;
import org.testng.annotations.*;

public class NGProyekA {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite A");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite A");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass A");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass A");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod A");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod A");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest A");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest A");
    }
    @Test
    public void testPenjumlahan() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Hasil Penjumlahan A");
        Assert.assertEquals(2+2,4);
    }
    @Test
    public void testPengurangan() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Hasil Pengurangan A");
        Assert.assertEquals(7-2,5);
    }
}
