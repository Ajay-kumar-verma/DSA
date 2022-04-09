public class interview {
    
public static void main(String[] args) {
    
 Node head=new Node(9);
//  head.next=new Node(9);
//  head.next.next=new Node(1);  
 
 int k=9;
// Node head=null; 

 head= sum(head,k);
while(head!=null){
    System.out.print(head.data+" ");
  head=head.next;
}

}
    
static Node  sum(Node node,int x){

    if(node==null){
        Node t =new Node(x);
        return t;
    } 
    int sum=0;
    if(node.next==null)
   {  
    sum=node.data+x;
    node.data=sum%10;
    x=sum/10;   
   }
   node.data=sum%10;
    x=sum/10;
     
   sum(node.next,x);
    
    if(x>0){
        Node t= new Node(x);
        t.next=node;
        return t;
    }
    else return node;

  
}





}



class Node {
int data;
    Node(int x){
    this.data=x;
    }
    Node next=null;
}