public class del_dup {
  // we can use set or map for unsorted linkend list 
    
    public static void main(String[] args) {
        
  Node node=new Node(45);
  node.next=new Node(56);
  node.next.next=new Node(56);
  node.next.next.next=new Node(56);
  node.next.next.next.next=new Node(4);

       del(node);
       p(node);

    }


  static void del(Node h){
        if(h==null) return ;
    int data=h.data;
     Node t=h.next;
     Node p=h;
     while(t!=null){
        if(data==t.data)
          p.next=t.next;
        else
      { p=t;
        data=t.data; 
      }
           t=t.next;    
    }
   
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
