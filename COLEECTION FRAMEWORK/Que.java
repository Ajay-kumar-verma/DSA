import java.util.*;

public class Que {
    
  public static void main(String[] args) {


    Queue<Integer> q= new LinkedList<Integer>();
    
        q.add(34);
        q.add(56);
        q.offer(890);
        q.offer(765);

        // add throw an exception if ele does not add 
        //offer does not throw an exception it return true or false

        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q.poll());
       // remove return ele or throw an exception if q is empty 
       // poll; is return null if q is empty 


        System.out.println(q.peek()); 
        System.out.println(q.element());
        // peek return null of ele 
        // element() return ele or throw an exception
        
        

        // BETTER USE not
        // offer poll peek


System.out.println("priority Queue");
new pq();

System.out.println("Deque Queue");
  new dq();
}

}

class pq{


pq(){
// Min heap
// Queue<Integer> q= new PriorityQueue<Integer>(); 

// Max heap 
Queue<Integer> q= new PriorityQueue<Integer>(Comparator.reverseOrder()); 

q.offer(45);
q.offer(5);
q.offer(46);
q.offer(0);

System.out.println(q.poll());
System.out.println(q.poll());
System.out.println(q);
System.out.println(q.peek()); 

}


}

class dq{


  dq(){

ArrayDeque<Integer> q= new ArrayDeque<Integer>(); 

q.offerFirst(34);
q.offerFirst(4);
q.offerFirst(3);
q.offerLast(78);

System.out.println(q);
System.out.println(q.pollFirst());
System.out.println(q.pollLast());


System.out.println(q.peekFirst());
System.out.println(q.peekLast()); 
}


}