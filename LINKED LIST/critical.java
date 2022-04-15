public class critical {
    
public static void main(String[] args) {

    Node head=new Node(45);
m1(head);

  System.out.println(head.data);
    // System.out.println(head.next.data);
}

static void m1(Node node){
    // node.data=346;git 
      node  =new Node(890);
    // Node x=node;
    // x.next=new Node(432);

  // m2(x);
} 

static void m2(Node node){

node.data=98;

}


}


class Node {
    int data;
    Node(int x)
      {data=x;}
Node next=null;
    }