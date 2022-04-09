import java.util.*;
public class singly_linked_list {
  static Scanner sc = new Scanner(System.in);   
  public static void main(String[] args){
      while(true){
         System.out.println("Enter your choice : ");
         System.out.println("1 \tInsert\t2 Delete");
         System.out.println("3 \tDisplay\t4 Count");
         System.out.println("5 \tReverse\t6 first Node ");
         System.out.println("7 \tLast Node\t8 Middle node ");
         System.out.println("9 \tNode by value \t10 Node by Position");
         int n=sc.nextInt();
          
         switch(n){
          case 1:m.insert();break;
          case 2:m.delete();break;
          case 3:m.display();break;
          case 4:m.count();break;
          case 5:m.reverse();break;
          case 6:m.first_node();break;
          case 7:m.last_Node();break;
          case 8:m.middle_Node();break;
          case 9:m.Nval();break;
          case 10:m.Npos();break;
           default:
         System.out.println("Invalid choice ....!");
         }

       }
    }

   
   }


// All methods 
class m{
static Node head=null;
static Scanner sc= new Scanner(System.in);

// Display data
static void display(){
if(head==null){ System.out.println("List is empty .....!"); return;}
  
System.out.print("DATA ARE : ");
Node node=head;
while(node!=null){
 System.out.print(node.x+"\t");
  node=node.next;
}
System.out.println();
}


// INSERT AND DELETE
static void insert(){
System.out.print("Enter value is : ");
int val=sc.nextInt();
Node node=new Node(val);
if(head==null){
  head=node; return;
}

// front insertion 
// node.next=head;
// head=node; return;
     
 Node last=head;
 while(last.next!=null) last=last.next;       
  last.next=node;  
}

static void delete(){
if(head==null){ System.out.println("List empty...!");  return;}

System.out.print("Enter data to be deleted :  ");
int key = sc.nextInt();

Node prev=null,temp=head;
while(temp!=null){
     if(temp.x==key) break;        
   prev=temp;
   temp=temp.next;
}
if(prev==null){
  head=head.next; 
  System.out.println(key+" deleted..");   
}   
else if(temp==null)
  System.out.println(key+" data is not present ..");
else  
{prev.next=temp.next;
   System.out.println(key+" deleted...!");
}

}

// Count 
static int  count(){
  if(head==null) {System.out.println("List empty "); return 0; }
 int count=0;
 Node temp=head;
 while(temp!=null){ 
         count++;
         temp=temp.next;
      }
System.out.println(count+" nodes are there...!");
 return count;
}


// REVERSE
static void reverse(){
  // Here  prev and head is main  
  Node prev=null;
while(head!=null)
  {   
     Node temp=head.next;  // Shifting head 
    //  here head is pointing to previous 
     head.next=prev; 

     // changing prev and head  
     prev=head;
     head=temp;          // head shifted..
  }
head=prev;

System.out.println("List reversed !");
 }


// static Node reverse(Node node,Node prev){
//    if(node==null) return prev;
//    Node temp=node;
//    node.next=prev;
//    return  reverse(temp.next,node); 

// }







//First Node 
static Node first_node(){
 if(head!=null)System.out.println(head.x);
   return head;
  }


// Last Node 
static Node last_Node(){

  // if(head==null) return null;
    Node  lastNode=null;
  //lastNode=head;
  // while(lastNode.next!=null) lastNode=lastNode.next;
   lastNode=lastNode(head);
System.out.println("Last node is : "+lastNode.x);
  return lastNode;
 } 

 static Node lastNode(Node node){
   if(node.next==null) return node;
   return lastNode(node.next);
 }




// Middle Node 
static Node middle_Node(){
  if(head==null) return null;
 Node SlowMover=head;
 Node FastMover=head;
 while(FastMover.next!=null){
   FastMover=FastMover.next;
  
  if(FastMover.next!=null){
   FastMover=FastMover.next; 
   SlowMover=SlowMover.next;
   }
  } 
   System.out.print(SlowMover.x+" ");
   return SlowMover;
}




// Node by val
static Node Nval(){
System.out.print("Enter val : ");
  int key =sc.nextInt();
   
  Node temp=head;
  while(temp!=null){
    if(temp.x==key) break;
   temp=temp.next; 
  }
  
  if(temp!=null)
    System.out.print(temp.x+" ");
  
  return temp;
}


static Node Nval(Node node,int val){
   if(node.x==val || node==null) return node;
   return Nval(node.next,val);
}




// node by pos
static Node Npos(){
  System.out.print("Enter pos : ");
    int pos =sc.nextInt();
    if(pos<1 && head!=null) return null;
    Node temp=head;
    for(int i=1;i<pos && temp!=null;i++) 
           temp=temp.next;    
                          
    if(temp==null)
      System.out.println("Invalid position !");  
    else
     System.out.println(temp.x+" ");      
    return temp;
  } 
 



//  All method done here ...
}




class Node{
    int x;
  Node(int val){
    this.x=val;
  }
Node next =null;
}
