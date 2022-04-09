import java.util.*;

public class LnkLst {
    
public static void main(String[] args) {

  
  LinkedList<Integer> ll= new LinkedList<Integer>();
  
  ll.add(5);
  ll.add(0,7);
  ll.add(9);
  

  System.out.println(ll.toString());
  
  ll.remove(1);
  ll.add(19);
  System.out.println(ll.toString());
  System.out.println(ll.get(2));

  Iterator<Integer> i= ll.iterator();

  while(i.hasNext())
    System.out.println(i.next()); 


}


}
