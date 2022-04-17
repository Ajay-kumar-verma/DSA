package SORTING;

public class Merge {

  public static void main(String[] args) {
 
  Node h1=new Node(72);
  Node h2=new Node(94);
  h1= add(h1,15);
  h1=add(h1,6);
  h1= add(h1,1);
  h2=add(h2,78);
  h2=add(h2,17);
  h2=add(h2,8);
  h2=add(h2,2);
  p(h1);
  p(h2);
//   p(m(h1,h2));
 p(sort(h1,h2));

   } 
   static Node add(Node node,int x){
     Node t= new Node(x);
     t.next=node;
     return  t; 
   }

  static void p(Node  node){
      if(node==null) return;
        Node t=node;
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }

     System.out.println();

  }

static Node m(Node n1,Node n2){
  
    if(n1==null) return n2;
    if(n2==null) return n1;
    
    Node t=n1;
    while(t.next!=null)
      t=t.next;    
    
      t.next=n2;
      return n1;  


}
static Node sort(Node n1,Node n2){
    if(n1==null) return n2;
    if(n2==null) return n1;
    
    Node node=null;
    if(n1.data<n2.data) {node=n1;n1=n1.next;}
     else {node=n2;n2=n2.next;}
      
   Node crnt=node;
     
   while(n1!=null && n2!=null){
        if(n1.data<n2.data){crnt.next=n1;n1=n1.next;}   
           else {crnt.next=n2;n2=n2.next;}
         crnt=crnt.next;  
   }
if(n1!=null)crnt.next=n1;
else crnt.next=n2; 

return node;

}

}

class Node{
int data;
    Node(int x){
     this.data=x;
    }
  Node next=null;
}