package abook;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class AddressBookMap {
private HashMap<String,String> addressBook= new HashMap<String,String>();

public void ListAll(){
  Set<String> keys = addressBook.keySet();     // The set of keys in the map.
  Iterator<String> keyIter = keys.iterator();
  while (keyIter.hasNext()) {
     String key = keyIter.next();  // Get the next key.
     Entry value = new Entry(key,addressBook.get(key));  // Get the value for that key.
     System.out.println( " Name:\t" + key + "PhoneNumber" + value.phoneNumber + "" );
  }
}
private void addEntry(Entry entry){
  addressBook.put(entry.entryName,entry.phoneNumber);
  System.out.println(" Entry successful!");
}
private Entry findEntry(String name){
  String entry=addressBook.get(name);
  if(entry!=null){
    System.out.println(" Found! ");
    System.out.print(" Name:\t"+name);
    System.out.println("Phone: "+entry);
    return new Entry(name,entry);
  }
  System.out.println(" Not found! ");
  return null;
}
private void deleteEntry(String name){
    addressBook.remove(name);
    System.out.println(" Deleted! ");
    return;
}

}