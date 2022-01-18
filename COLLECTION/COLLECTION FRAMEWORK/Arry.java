import java.util.*;
public class Arry {
    
public static void main(String[] args) {
//   we must have to mention what type arylst creating and 
// and assigning with same variable 


// ArrayList and Vector are same 
// bit difference in that 

// ArrayList<Integer> ary= new ArrayList<Integer>();
// It maintains insertion order 
Vector<Integer> ary= new Vector<Integer>();



// System.out.println(ary.size());

ary.add(45);
ary.add(1,4);
ary.add(2,5);
ary.add(1,7);
ary.set(1,56);

System.out.println(ary.get(1));

ary.remove(2); // it remove by index
ary.remove(Integer.valueOf(45));// this will remove by value if there 

System.out.println(ary.contains(7));
System.out.println(ary.size());
System.out.println(ary.isEmpty());

System.out.println(ary.toString());

for(int x:ary)
  System.out.println(x);

 
 System.out.println("Iterating elements ...!");
 
 Iterator<Integer> i = ary.iterator();
 
 while(i.hasNext())
   System.out.println(i.next());
 
    
System.out.println(ary.toString());
// System.out.println(ary.toArray());


}




}
