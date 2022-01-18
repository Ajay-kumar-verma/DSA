package collection;
import java.util.*;

public class List {
public static void main(String[] args){

    // new AryLst();
    // new LkdLst();
    // new Vctr();
    //  new Stk();
    new Ll();
}
}


class AryLst{
// it uses Dynamics array internally 
AryLst(){

ArrayList<Integer> ar=new ArrayList<Integer>();   
ar.add(234);
ar.add(34);
ar.add(4);
ar.add(0,24);
ar.add(2);




Iterator itr=ar.iterator();

// System.out.println(itr.next());
// System.out.println(itr.next());
// System.out.println(itr.next());
// System.out.println(itr.next());
// System.out.println(itr.next());
// System.out.println(itr.hasNext());


while(itr.hasNext()){
    System.out.println(itr.next());
}



System.out.println(ar.size());

}
}


class LkdLst{
// it uses douly linked lsit internally
// it maintain insertion order 


LkdLst(){
    LinkedList<String> ll=new LinkedList<String>();  
    ll.add("Ravi");  
    ll.add(0,"Vijay");  
    ll.add("Ravi");  
    ll.add("Ajay");  

    // System.out.println(ll.get(3));
    // System.out.println(ll.getFirst());

    Iterator<String> itr=ll.iterator();  
   
    while(itr.hasNext())
    {  
      System.out.println(itr.next());  
    }  
}


}

class Vctr{

// Vector uses a dynamic array to store the data elements.
// It is similar to ArrayList. However, It is synchronized 
//and contains many methods that are not the part of Collection framework.


Vctr(){
Vector<Integer> v =new Vector<Integer>();

v.add(3);
v.add(33);
v.add(0,53); 
v.add(321);

Iterator i= v.iterator();

while(i.hasNext()){
    System.out.println(i.next());
}

}

}


class Stk{


Stk(){

Stack<Integer> s= new Stack<Integer>();
s.push(5);
s.push(4);
s.push(6);
s.push(7);
s.push(8);

System.out.println(s.pop());
System.out.println(s.pop());
System.out.println(s.pop());

Iterator i = s.iterator();
while(i.hasNext()){
  System.out.println(i.next()+" "+s.peek());
}

}


}


// Using non primitive Data type 


// class Ll{

// Ll(){

// LinkedList<Node> l=new LinkedList<Node>();

// l.add(new Node(5,6));
// l.add(new Node(56,7));
// l.add(new Node(35,8));
// l.add(new Node(85,36));

// Iterator i= l.iterator();

// while(i.hasNext()){
//    System.out.println(i.next().data);
// }


// }

// }


// class Node {
// int data;
// int qnty;

//  Node(int a,int b){
//    this.data=a;
//    qnty=b;
//     }
// }



