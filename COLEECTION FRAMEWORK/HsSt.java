import java.util.*;

public class HsSt {

   public static void main(String[] args) {

    HashSet<Integer> hs= new HashSet<Integer>();

    hs.add(45);
    hs.add(-40);
    hs.add(1445);
    System.out.println(hs.add(4));
    System.out.println(hs.add(4));
     

Iterator<Integer> i=hs.iterator();

while(i.hasNext())
  System.out.println(i.next());








   } 
    

}

