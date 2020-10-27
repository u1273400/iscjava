package abook;

import io.TextIO;

public class Main {
    private static AddressBookArray adbook=new AddressBookArray();
    private static Entry[] e3={
        new Entry("Mark","080555"),
        new Entry("Owen","080565"),
        new Entry("Shaw","080577"),
    };
    private static Entry[] e4={
        new Entry("Mark","080555"),
        new Entry("Owen","080565"),
        new Entry("Shaw","080577"),
        new Entry("Aardat","080477"),
    };

    private static int getSizeArray(){
        int getSize=0;
        for(int i=0;i<adbook.addressBook.length;i++) {
            if (adbook.addressBook[i] != null)
                getSize++;
        }return getSize;
    }

    public static void testArrayAddEntry() {
        //activation
        System.out.println("abook size="+getSizeArray());
        //action
        for(Entry entry:e3) adbook.addEntry(entry);
        //assertion
        assert 3==getSizeArray():"testAddEntry() fail!";
        adbook.listAll();
    }

    public static void testArrayOverflow() {
        //setup
        System.out.println("abook size="+getSizeArray());
        //act
        for(Entry entry:e4) adbook.addEntry(entry);
        System.out.println("abook size="+getSizeArray());
        //assert
        assert e4.length==getSizeArray()+1 : "testArrayOverflow() fail!";
    }

    public static void main (String args[]){
      //testArrayAddEntry();
      testArrayOverflow();
    }
}