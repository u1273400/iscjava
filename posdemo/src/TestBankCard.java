import org.junit.*;
import static org.junit.Assert.*;

public class TestBankCard {

    @Test
    public void getPinShouldReturnString() {
        BankCard tester = new BankCard(); // BankCard is tested

        // assert statements
        assertTrue(String.class.isInstance(tester.getPin()));
    }
}