public class split {
    
public static void main(String[] args) {
    Node node=new Node(45);
    node.next=new Node(56);
    node.next.next=new Node(89);
    node.next.next.next=new Node(123);
    // node.next.next.next.next=new Node(13);

   Node m=mid(node);
   Node node2=m.next;
   m.next=null;
   p(node);
   p(node2);
}


static Node mid(Node head){
    if(head==null || head.next==null) return null; 
  
    Node s=head;
    Node f=head;

    while(f.next!=null && f.next.next!=null){
      s=s.next;
      f=f.next.next;
    }

 return s;

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
}


class Node{

    int data=0;
    Node(int d){
        this.data=d;
    }
    Node next=null;
}
