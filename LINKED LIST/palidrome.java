public class palidrome {
    
public static void main(String[] args) {
    Node node=new Node(45);
     node.next=new Node(56);
     node.next.next=new Node(6);
     node.next.next.next=new Node(56);
     node.next.next.next.next=new Node(4);
  
System.out.println(pal(node));


}

static boolean pal(Node h){

     Node m=mid(h);
     Node rev=r(m);
  
   while(rev!=null){
       if(rev.data!=h.data) return false;
       rev=rev.next;
       h=h.next; 
   }  
  return true;


}

static Node mid(Node head){
  if(head==null || head.next==null) return null;

  Node s=head.next;
  Node f=head.next;

  while(f.next!=null && f.next.next!=null){
  s=s.next;
  f=f.next.next;
  }
  return s;

}

static Node r(Node head){

    //  if(head==null ||head.next==null) return head;
    Node p=null; 
   while(head!=null){
     Node t=head.next;
      head.next=p;
      p=head;
      head=t;
   } 
    // head=p;
   return p;
}


}
class Node{

    int data=0;
    Node(int d){
        this.data=d;
    }
    Node next=null;
}
