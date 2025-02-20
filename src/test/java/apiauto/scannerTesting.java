package apiauto;
import org.testng.annotations.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;
import static org.testng.Assert.assertEquals;

public class scannerTesting {
    @Test
    public void testScannerInput() {
        String Kalimat = "Sultanunnadif!\n27";
        ByteArrayInputStream inputObject = new ByteArrayInputStream(Kalimat.getBytes());
        System.setIn(inputObject);

        Scanner objectScanner = new Scanner(System.in);
        String kalimatInput = objectScanner.nextLine();
        int age = objectScanner.nextInt();

        assertEquals(kalimatInput, "Sultanunnadif!", "InputValid.");
        assertEquals(age, 27,"InputValid");
    }
}
