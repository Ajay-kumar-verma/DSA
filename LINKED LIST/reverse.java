public class reverse {
public static void main(String[] args) {
    Node node=new Node(45);
    //   linked list  is there in ram and its ddress is mapped with node 


  // Node node=null;
     node.next=new Node(56);
     node.next.next=new Node(89);
     node.next.next.next=new Node(123);
  
   p(node);// print in sequence
   Node nw=  r1(node);
    //  it return reverse ll and add of first node 
   p(nw); // it print reverse 
  
   p(node); // it point to first node  it next is null
   





}

static void p(Node head){
  if(head==null) return ;
  Node t=head;
  while(t!=null){
      System.out.print(t.data+" ");
    t=t.next;
    }
System.out.println();
}





// same eaddress is map with head here    
// finally  head will point to null
// head is local variable here 


// initially head point to first node finally it point to null
static Node r1(Node head){

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
