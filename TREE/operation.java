import java.util.Scanner;
public class operation{
 static    Scanner sc= new Scanner(System.in);
  public static void main(String[] args)
{
     for(;;)
    {
     System.out.println("-------------MENU-----------"); 
     System.out.println("1 : Insert\t2 : Display");
     System.out.println("3 : Search\t4 : Delete");
     System.out.println("5 : No of nodes \t6 : Height of tree");
     switch(sc.nextInt())
    {   
    case 1: m.insert();break;
    case 2: m.display();break;
    case 3: m.search();break;
    case 4: m.delete();break;
    case 5: m.Nodes();break;
    case 6: m.Height();break;
    
    default:
    System.out.println("Invalid choice ..!");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
       break;
    } 
  
  }

}






}


class m{
static Node root=null;
static Scanner sc= new Scanner(System.in);

// INSERTION AND DELETION 
// INSERT 
static void insert(){
System.out.print("Enter data : ");
Node  node=new Node(sc.nextInt());
                sc.nextLine();
if(root==null){root=node; return;}
// we have make changed at root level 
  Node temp=root;
  Node prev=null;
  while(temp!=null)
  {   prev=temp;
     if(node.data==prev.data){System.out.println("Duplicate data not allowed...!"); return;}
    if(node.data < root.data)
        temp=temp.ll; 
     else
       temp=temp.rl;
  }


  if(node.data<prev.data)
   prev.ll=node;
  else
  prev.rl=node;


}
// END INSERT 
// DELETION OPERATION
 static void delete()
   {   System.out.print("Enter key : "); 
      
       int key = sc.nextInt();sc.nextLine();
       //  delete number 
       
       Node parent,cur,q;
       parent=null;
       cur=root;
       
      // getting node , address  of key  or cur
       while(cur!=null)
         {   
            if(cur.data==key)
             break;

             parent=cur;
            if(key < cur.data)
               cur=cur.ll;
            else
               cur=cur.rl;
         }



      if(cur==null)
        {System.out.println(key +" does not exist ...!"); return;}  
     
        if(cur.ll==null)
      {  q=cur.rl;}
      else if(cur.rl==null)
      { q=cur.ll;}

      //Making single node without changing 
      //arrangement of tree  with same order 
      else{  
       Node suc=cur.ll;
      while(suc.rl==null)
         suc=suc.rl;
         suc.rl=cur.rl;
         q= cur.ll;
       }
   
   
   
    //if key is there at root   
   if(parent==null) 
    {root=q; return;}
 
  if(parent.ll==cur)
   {parent.ll=q;}
  else
  {parent.rl=q;}

return;
 }


//END DELETION OPERATION 



// SEARCHING AND SORTING 
// DISPLAY 
static void display(){
// We have tree types of traversing in tree 
  // preOrder 
  // Postorder 
  // InOrder 

  if(root==null) {System.out.println("Empty..!");return;}
   System.out.print("Desc order  : ");
   Highlow(root);
   System.out.println(" ");
   System.out.print("Ascen order  : ");
   LowHigh(root);
   System.out.println(" ");
  }

static void Highlow(Node temp)
 {
   if(temp==null)
        return;
   Highlow(temp.rl);
   System.out.print(temp.data+"\t");
   Highlow(temp.ll);
 }

 static void LowHigh(Node temp)
 {
     if(temp==null)
        return;
   LowHigh(temp.ll);
   System.out.print(temp.data+"\t");
   LowHigh(temp.rl);
}
// END DISPLAY



// SEARCH .....
static void search()
{   if(root==null){System.out.println("Empty Tree.. "); return ;}
    System.out.print("Enter key : ");
   
    int key = sc.nextInt();sc.nextLine();

    Node temp=root;
    while(temp!=null)
      {   
        if(temp.data==key) {System.out.println(key+" is there in Tree...!"); return;}
        if(key < temp.data) temp= temp.ll;
        else temp = temp.rl;
      }
  System.out.println(key+" is not therein Tree....!");
}
// END SEARCH ....


static int countleaf=0;
static int Nodes(){
  countleaf=0;
  counts(root);
System.out.println("Counts nodes : "+countleaf);
  return countleaf;
 }  

static void  counts(Node node) {
      if(node==null) return ;
      countleaf++;
      counts(node.ll);counts(node.rl);
   
   }

// HEIGHT OF TREE_SET
static int  Height(){ 
  
  System.out.println("Height is : "+Height(root));
  return 0;}
static int max(int a,int b){return (a>b)?a:b;} 
static int  Height(Node node){
  if(node==null) return -1;
   return 1+max(Height(node.ll),Height(node.rl));

}



// END OF M 
}





// NODE 
class Node{
int data;
Node(int data)
{
    this.data=data;
}

Node rl=null;
Node ll=null;

}
