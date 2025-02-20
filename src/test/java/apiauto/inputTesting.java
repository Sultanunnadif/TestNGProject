package apiauto;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class inputTesting {
    public static String inputWords(String input){
        return input;
    }
    @Test
    public void methodTest(){
        String Result = inputWords("Nadif");
        assertEquals(Result,"Nadif");
    }
    public static String inputNumber(int number) {
        if (number >=20 && number <=50){
            return "Valid";
            }else{
            return "Invalid";
        }
    }
    @Test
    public void testInputInRange() {
        // Simulating user input with different values
        String result = inputNumber(30);
        assertEquals(result, "Valid");

        result = inputNumber(19);
        assertEquals(result, "Invalid");

        result = inputNumber(51);
        assertEquals(result, "Invalid");
    }
}
