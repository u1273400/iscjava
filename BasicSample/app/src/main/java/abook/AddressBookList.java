package abook;
import java.util.List;
import java.util.ArrayList;

public class AddressBookList {
    public List<Entry> addressBook= new ArrayList<Entry>();

    public void ListAll(){
        for(Entry entry:addressBook){
                System.out.print(" Name: "+ entry.entryName);
                System.out.println("\tPhone: "+entry.phoneNumber);
            }
        }

    private void addEntry(Entry entry){
        addressBook.add(entry);
        System.out.println(" Entry successful!");
    }
    private Entry findEntry(String name){
        for(Entry entry:addressBook){
            if(entry.entryName.equals(name)){
                System.out.println(" Found! ");
                System.out.print(" Name: "+entry.entryName);
                System.out.println("\tPhone: "+entry.phoneNumber);
                return entry;
            }
        }
        System.out.println(" Not found! ");
        return null;
    }
    private void deleteEntry(String name){
        Entry entry=findEntry(name);
        if(entry!=null)addressBook.remove(entry);
        System.out.println(" Deleted! ");
        return;
    }

}