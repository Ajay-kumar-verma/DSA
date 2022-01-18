import java.util.*;
public class BinaryTree {
 
public static void main(String[] args)
{
  Node root= new Node(4);
  root.left=new Node(12);
  root.left.left=new Node(6);
  root.left.right=new Node(78);
  root.right=new Node(2);
  root.right.left=new Node(18);
  root.right.right=new Node(8);
   preOrder(root);
}    

static void preOrder(Node root)
{
  if(root==null)
       return;

   Stack<Node> s=new Stack<Node>();
  Node cur=root;
  while(true)
  { 
     for(;cur!=null;){
     s.push(cur); 
     System.out.print(cur.data+" ");
     cur=cur.left; 
     }   
      
     if(!s.isEmpty())
       cur=s.pop().right;
     else
         return ;
      



  }
   
  





}


}




class Node{
    int data;
    Node(int x){
        this.data =x;
 
    }
  Node left=null,right=null;

}







