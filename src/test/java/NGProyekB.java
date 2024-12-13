import org.testng.Assert;
import org.testng.annotations.*;

public class NGProyekB {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite B");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite B");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass B");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass B");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod B");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod B");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest B");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest B");
    }
    @Test
    public void testPenjumlahan() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Hasil Penjumlahan B");
        Assert.assertEquals(2+2,4);
    }
    @Test
    public void testPengurangan() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Hasil Pengurangan B");
        Assert.assertEquals(7-2,5);
    }
}
