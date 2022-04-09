import java.util.*;

public class LnHsSt {
    
public static void main(String[] args) {

LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();

lhs.add(456);
lhs.add(541);
lhs.add(98);
lhs.add(456);

System.out.println(lhs.contains(541));
Iterator<Integer> i=lhs.iterator();

while(i.hasNext())
  System.out.println(i.next());




}

}
