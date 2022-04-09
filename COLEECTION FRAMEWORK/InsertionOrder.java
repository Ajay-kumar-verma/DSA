import java.util.*;
public class InsertionOrder {
    public static void main(String[] args) {


     new A();
     new L();
     new S();      

    }

}

class A{

A(){

    System.out.println("ArrayList ..............");
ArrayList<Integer> a=new ArrayList<Integer>();
a.add(2);
a.add(15);
a.add(5);
a.add(-68);

Iterator<Integer> i=a.iterator();
while(i.hasNext())
System.out.print(i.next()+" ");

System.out.println("");
}

}



class L{

L(){
 
    System.out.println("ArrayList ..............");
    LinkedList<Integer> a=new LinkedList<Integer>();
    a.add(2);
    a.add(15);
    a.add(5);
    a.add(-68);
    
    
    Iterator<Integer> i=a.iterator();
    while(i.hasNext())
    System.out.print(i.next()+" ");
    
    System.out.println("");


}
}

class  S{

S(){

    
    System.out.println("ArrayList ..............");
    Stack<Integer> a=new Stack<Integer>();
    a.add(2);
    a.add(15);
    a.add(5);
    a.add(-68);
    
    
    Iterator<Integer> i=a.iterator();
    while(i.hasNext())
    System.out.print(i.next()+" ");
    
    
System.out.println("");
}

}


class  LS{

    LS(){
    
        
        System.out.println("ArrayList ..............");
        LinkedHashSet<Integer> a=new LinkedHashSet<Integer>();
        a.add(2);
        a.add(15);
        a.add(5);
        a.add(-68);
       
        
        Iterator<Integer> i=a.iterator();
        while(i.hasNext())
        System.out.print(i.next()+" ");
        
        
    System.out.println("");
    }
    
    }