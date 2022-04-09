import java.util.*;
public class Queue {
    
    static Scanner sc= new Scanner(System.in);
public static void main(String[] args)
 {
   for(;;)
     {  
         System.out.println("Enter choice");
         System.out.println("1\tAdd\t2\tremove");
         int n=sc.nextInt();

       switch(n)
       {
         case 1:add();break;
         case 2:remove();break;
         default:
         System.out.println("Invalid choice");
        }

     }

 }

 static Node  head=null;
static void add()
  {  int val= sc.nextInt();
    Node node=new Node(val);
    node.next=head;  
    head=node; 
  }
static void remove()
  {  
      if(head==null)
      {
        System.out.println("queue empty");
          return; 
       }
  

  Node temp=head;
    Node prev=null;

  while(temp.next!=null)
    {   
        prev=temp;
        temp=temp.next;
    }        
 if(prev==null){
     System.out.println(temp.x);
      head=null;
}
else
  { 
   System.out.println(temp.x);
   prev.next=null; 
  }


  }

}

class Node{
    int x;
  Node(int val){
    this.x=val;
  }
Node next =null;
}
