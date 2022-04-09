import java.util.*;
public class stk_sug_que {

 static Queue<Integer> q1=new LinkedList<Integer>();   
 static Queue<Integer> q2=new LinkedList<Integer>();   
 
public static void main(String args[]){


  push(23);
  push(3);
  push(123);
  push(233);
  push(567);

// Here we pushing ele in stack order 

// we can write code for pop() ele in statck order also 

System.out.println(q1.toString());
System.out.println(pop());
System.out.println(pop());
System.out.println(q1.toString());
}




static void push(int val){
     q2.offer(val);
 
     while(!q1.isEmpty())
     q2.offer(q1.poll());
    
    //  System.out.println(" q2 "+q2.toString());
    
     
     while(!q2.isEmpty())
     q1.offer(q2.poll());
    
    // System.out.println(" q1 "+q1.toString());   
      
}
     
static int pop(){
  return q1.poll();
}




// static void push(int val){
  
//      if(q2.isEmpty()){
//         q2.offer(val);
//         while(!q1.isEmpty())
//         q2.offer(q1.poll());
//      }
//     else {
//         q1.offer(val);
//         while(!q2.isEmpty())
//         q1.offer(q2.poll());
//      }
     
//    //  System.out.println(" q2 "+q2.toString());
   
    
//     // while(!q2.isEmpty())
//     // q1.offer(q2.poll());
   
//    // System.out.println(" q1 "+q1.toString());   
     
// }



// static int pop(){

//  if(q2.isEmpty()){
//       return q1.poll();
//  }

//  else
//    return q2.poll();

// }










}






