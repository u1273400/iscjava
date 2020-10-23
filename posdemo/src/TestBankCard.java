import org.junit.*;
import static org.junit.Assert.*;

public class TestBankCard {

    @Test
    public void getPinShouldReturnString() {
        BankCard tester = new BankCard(); // BankCard is tested
        System.out.println("hello world"+String.class.isInstance(tester.getPin()));
        // assert statements
        assertTrue(String.class.isInstance(tester.getPin()));
    }
}