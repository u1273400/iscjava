package abook;


public class AddressBookList {
private List addressBook= new ArrayList();

public void ListAll(){
    for(Entry entry:addressBook){
            System.out.print(" Name:\t"+ entry.entryName);
            System.out.println("Phone: "+entry.phoneNumber);
        }
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
            System.out.print(" Name:\t"+entry.entryName);
            System.out.println("Phone: "+entry.phoneNumber);
            return entry;
        }
    }
    System.out.println(" Not found! ";
    return null;
}
private void deleteEntry(String name){
    Entry entry=findEntry(name);
    if(entry!=null)addressBook.remove(entry);
    System.out.println(" Deleted! ");
    return;
}

}