package abook;


public class AddressBookMap {
private HashMap<String,String> addressBook= new HashMap<String,String>();

public void ListAll(){
  Set<String> keys = map.keySet();     // The set of keys in the map.
  Iterator<String> keyIter = keys.iterator();
  while (keyIter.hasNext()) {
     String key = keyIter.next();  // Get the next key.
     Double value = map.get(key);  // Get the value for that key.
     System.out.println( " Name:\t" + key + "PhoneNumber" + value + "" );
  }
}
private void addEntry(Entry entry){
  addressBook.put(entry.entryName,entry.phoneNumber);
  System.out.println(" Entry successful!");
}
private Entry findEntry(String name){
  Entry entry=addressBook.get(name);
  if(entry.entryName!=null){
    System.out.println(" Found! ");
    System.out.print(" Name:\t"+entry.entryName);
    System.out.println("Phone: "+entry.phoneNumber);
    return entry;
  }
  System.out.println(" Not found! ";
  return null;
}
private void deleteEntry(String name){
    addressBook.remove(entry);
    System.out.println(" Deleted! ");
    return;
}

}