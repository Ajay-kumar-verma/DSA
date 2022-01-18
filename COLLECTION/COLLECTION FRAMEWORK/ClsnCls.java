import java.util.*;

public class ClsnCls {

    public static void main(String args[])
    {
  ArrayList<Integer> a=new ArrayList<Integer>();

  a.add(12);
  a.add(34);
  a.add(2);
  a.add(3);
  a.add(8);
  a.add(6);
  a.add(3);
  a.add(6);
 
System.out.println(Collections.min(a));
System.out.println(Collections.max(a));
System.out.println(Collections.frequency(a,3));

Collections.sort(a,Comparator.reverseOrder());

for(int x:a)
System.out.print(x+" ");

System.out.println("");
new userDefined();

    }
}


class userDefined{

  userDefined(){

   LinkedList<node> ll= new LinkedList<node>();
   ll.add(new node(4,6)); 
   ll.add(new node(6,18));
   ll.add(new node(7,9));
   ll.add(new node(16,80));
   ll.add(new node(7,9));
    

    Collections.sort(ll,new Comparator<node>(){
   public int compare(node o1,node o2){
         return o1.y-o2.y;
   }

    });

    Iterator<node> i=ll.iterator();
  while(i.hasNext())
{    node n=i.next();
       System.out.print(n.x+" "+n.y+" :");
}   

   
    

  }



}


class node{
 int x;
 int y;
    node(int x,int y)
  {  this.x=x;
    this.y=y;
  }
  


}