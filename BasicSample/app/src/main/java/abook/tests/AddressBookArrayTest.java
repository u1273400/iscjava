import abook.AddressBookArray;
import org.junit.BeforeClass;
import org.junit.Test;
import abook.Entry;
import static org.junit.Assert.*;

public class AddressBookArrayTest {
    abook.AddressBookArray adbook=new AddressBookArray();
    Entry[] e3={
        new Entry("Mark","080555"),
        new Entry("Owen","080565"),
        new Entry("Shaw","080577"),
    };
    Entry[] e4={
        new Entry("Mark","080555"),
        new Entry("Owen","080565"),
        new Entry("Shaw","080577"),
        new Entry("Aardat","080477"),
    };

    @BeforeClass
    public static void beforeClass() throws Exception {
    }

    private int getSize(){
        int getSize=0;
        for(int i=0;i<adbook.addressBook.length;i++) {
            if (adbook.addressBook[i] != null)
                getSize++;
        }return getSize;
    }

    @Test
    public void testAddEntry() {
        //activate
        System.out.println("abook size="+getSize());
        //assertArrayEquals(new int[]{1,2,3},new int[]{1,2,3});
        //act
        for(abook.Entry entry:e3) adbook.addEntry(entry);
        //assert
        assertEquals(3,getSize());
    }

    @Test //(expected = IndexOutOfBoundsException.class)
    public void testOverflow() {
        //setup
        System.out.println("abook size="+getSize());
        //assertArrayEquals(new int[]{1,2,3},new int[]{1,2,3});
        //act
        for(Entry entry:e4) adbook.addEntry(entry);
        //assert
        assertEquals(e4.length,getSize()+1);
    }
}