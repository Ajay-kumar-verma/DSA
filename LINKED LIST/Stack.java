import java.util.*;
public class Stack {
   static Scanner sc= new Scanner(System.in); 

public static void main(String[] args)
{
  for(;;)
    {
      System.out.println("1\tpush\t2\tpop");
      int n=sc.nextInt();
      switch(n)
      {
          case 1:push();break;
          case 2:pop();break;
          default:
          System.out.println("Invalid choice");
      }

    }




}

static Node head=null;
static void push(){
  System.out.print("Enter value : ");
  int val= sc.nextInt();
  Node node =new Node(val);
  node.next=head;
  head=node;
}
static void pop(){
 if(head==null)
  { 
    System.out.println("Stack empty...!");
  }
  else{
      System.out.println(head.x);
      head=head.next;
  }

}


}



class Node 
{
    int x;
  Node(int val)
    {
     this.x=val;
    }

    Node next=null;
}