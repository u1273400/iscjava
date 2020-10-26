import abook.AddressBookArray;
import org.junit.Test;
//import abook;
import static org.junit.Assert.*;

public class AddressBookArrayTest {
    abook.AddressBookArray adbook=new AddressBookArray();

    private int getSize(){
        int getSize=0;
        for(int i=0;i<adbook.addressBook.length;i++) {
            if (adbook.addressBook[i] != null)
                getSize++;
        }return getSize;
    }

    @Test
    public void testAddEntry() {
        //setup
        System.out.println("abook size="+getSize());
        //assertArrayEquals(new int[]{1,2,3},new int[]{1,2,3});
        //act
        abook.Entry[] e={
                new abook.Entry("Mark","080555"),
                new abook.Entry("Owen","080565"),
                new abook.Entry("Shaw","080577"),
        };

        for(abook.Entry entry:e) adbook.addEntry(entry);
        //assert
        assertEquals(3,getSize());
    }

    @Test
    public void testOverflow() {
    }
}