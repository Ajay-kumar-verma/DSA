import java.util.*;

public class Stk {
public static void main(String[] args) {

    // It mamtain insertion order  
 Stack<String> s=new Stack<String>();    

 s.push("Ajay");
 s.push("vijay");
 s.push("rakesh");   
 

Iterator<String> i=s.iterator();
while(i.hasNext())
  System.out.println(i.next());


System.out.println(s.toString());
System.out.println(s.peek());
System.out.println(s.pop());
System.out.println(s.toString());



}

}
