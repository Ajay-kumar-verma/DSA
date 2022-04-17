public class loop {
    // we can use set or map 

public static void main(String[] args) {
    Node node=new Node(45);
    node.next=new Node(56);
   Node n3= new Node(6);
   node.next.next=n3;
   node.next.next.next=new Node(56);
    node.next.next.next.next=new Node(4);
     Node t=new Node(98);
    node.next.next.next.next.next=t;
     t.next=n3;
    Node l=lp(node);
    if(l==null){
        System.out.println("Lopp not there ..!");
    }
   else{
       Node t1=node;
      Node t2=l;
      Node p=t2;
      while(true){
       if(t1==t2){
           System.out.println("loop at "+t1.data);
               p.next=null;
           break;
         } 
         p=t2;
       t1=t1.next;
       t2=t2.next;
     }    


      }
      p(node);

}

static Node lp(Node h){
  Node s=h;
  Node f=h;

  while(f!=null && f.next!=null){
     s=s.next;
     f=f.next.next;
       if(s==f) return s;

  }
return null;

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
