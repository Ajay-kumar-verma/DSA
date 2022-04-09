import java.util.*;
public class Map {
    
public static void main(String[] args) {

    System.out.println(" Hash map ....  ");

    // A Map is useful if you have to search, update
    //  or delete elements on the basis of a key.
   
    // HashMap<Integer, String> hm = new HashMap<Integer, String>();
  
    // hm.put(1, "Geeks");
    // hm.put(2, "For");
    // hm.put(3, "Geeks");

    // // Finding the value for a key
    // System.out.println("Value for 1 is " + hm.get(1));

    // in this easy to insertion and deletion 
    // HashMap<String,String> hm=new HashMap<String,String>();  
        
    // it maintains insertion order 
     // LinkedHashMap<String,String> hm=new LinkedHashMap<String,String>();  
  
    // it sort the data according to keys
    TreeMap<String,String> hm=new TreeMap<String,String>();  
   



    hm.put("name", "Ajay kumar verma");
    hm.put("addr", "Bangalore ");
   
    // for checking key present are not 
     System.out.println(hm.containsKey("name"));
     System.out.println(hm.containsKey("me"));
     
    //  for checking for values are there or not 
     System.out.println(hm.containsValue("Bangalore "));
     System.out.println(hm.containsValue("kumar"));

    //    getting value by key 
       System.out.println(hm.get("name"));
       System.out.println(hm.get("addr"));
     
  
        Set s=hm.keySet();
    //    System.out.println(hm.keySet().toString());
  
   System.out.println(s.toString()); 
  
   Iterator<String> i=s.iterator();
   while(i.hasNext()){
        System.out.print(hm.get(i.next())+" \t");
   }
   



}


}
