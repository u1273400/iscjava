package abook;


public class AddressBookArray {
private Entry[] addressBook= new Entry[3];

public void ListAll(){
    for(int i=0;i<addressBook.length;i++){
        if(addressBook[i]!=null){
            System.out.print(" Name:\t"+addressBook[i].entryName);
            System.out.println(" Phone: "+addressBook[i].phoneNumber);
        }
    }
}
private void addEntry(Entry entry){
    for(int i=0;i<addressBook.length;i++){
        if(addressBook[i]==null){
            addressBook[i]=new Entry();
            addressBook[i].entryName=entry.entryName;
            addressBook[i].phoneNumber=entry.phoneNumber;
            System.out.println(" Entry successful!");
            return;
        }
    }
    System.out.println(" No room found for entry!");
}
private Entry findEntry(String name){
    for(int i=0;i<addressBook.length;i++){
        if(addressBook[i]!=null && addressBook[i].entryName.equals(name)){
            System.out.println(" Found! ");
            System.out.print(" Name:\t"+addressBook[i].entryName);
            System.out.println(" Phone: "+addressBook[i].phoneNumber);
            return addressBook[i];
        }
    }
    System.out.println(" Not found! ");
    return null;
}
private void deleteEntry(String name){
    for(int i=0;i<addressBook.length;i++){
        if(addressBook[i]!=null && addressBook[i].entryName.equals(name)){
            System.out.println(" Found and deleted! ");
            addressBook[i]=null;
            return;
        }
    }
    System.out.println(" Not found! ");
    return;
}

}