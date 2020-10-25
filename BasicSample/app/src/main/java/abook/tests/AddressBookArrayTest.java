import abook.AddressBookArray;
import org.junit.Test;
//import abook;
import static org.junit.Assert.*;

public class AddressBookArrayTest {
    abook.AddressBookArray adbook=new AddressBookArray();

    @Test
    public void testAddEntry() {
        //setup
        int getSize=0;
        for(int i=0;i<adbook.addressBook.length;i++) {
            if (adbook.addressBook[i] != null)
                getSize++;
        }
        System.out.println("abook size="+getSize);
        assertArrayEquals(new int[]{1,2,3},new int[]{1,2,3});
        //act
        //assert
    }

    @Test
    public void listAll() {
    }
}