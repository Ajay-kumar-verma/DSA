public class middle {

    public static void main(String[] args) {
        
        Node node=new Node(45);
        node.next=new Node(56);
        node.next.next=new Node(89);
        node.next.next.next=new Node(123);
        // node.next.next.next.next=new Node(13);
       System.out.println(mid(node).data);

    }

static Node mid(Node head){
    if(head==null || head.next==null) return null; 
  
    Node s=head.next;
    Node f=head.next;
  
    // s keep tracking mid for odd 
    // and  for even right side node 
    //  it is used for checking palidrome 


    //  if next two node are there than
    while(f.next!=null && f.next.next!=null){
      s=s.next;
      f=f.next.next;
    }

 return s;

//  Node s=head;
//  Node f=head;

// for add it coreect mid 
// for even it give left node 
// it is useful for splitting and meger sort   




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
