public class llRvs {
    
public static void main(String[] args) {

   Node head=new Node(34);
   head.next=new Node(12);
  head.next.next=new Node(90);
  head.next.next.next=new Node(678);

  r(head);
}



static void r(Node node){
 if(node==null) return;
  r(node.next);  
    System.out.print(node.data+" "); 
}

}

class Node{

int data;
Node(int x){
  this.data=x;}

  Node next=null;
}