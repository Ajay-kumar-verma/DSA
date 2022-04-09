import java.util.*;

public class ClsnCls {

    public static void main(String args[])
    {

// for Single value list 
      ArrayList<Integer> a=new ArrayList<Integer>();
  a.add(12);
  a.add(34);
  a.add(2);
  a.add(3);
  a.add(8);
  a.add(6);
  a.add(3);
  a.add(6);
 
System.out.println("MIN VALUE = "+ Collections.min(a));
System.out.println("MAX VALUE = "+Collections.max(a));
System.out.println("FREQUENCY OF 3 = "+Collections.frequency(a,3));


//  it will sort in desc order
Collections.sort(a,Comparator.reverseOrder());

for(int x:a)
System.out.print(x+" ");


System.out.println("\nList for Multiple Values  ");
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
    

  //   Collections.sort(ll,new Comparator<node>(){
  //  public int compare(node o1,node o2){
  //        return o1.y-o2.y;
  //  }

  //   });


  // lamda function 
   Collections.sort(ll,(node o1,node o2)-> o1.x-o2.x);

    Iterator<node> i=ll.iterator();
  while(i.hasNext())
{    node n=i.next();
       System.out.println("x= "+n.x+" y = "+n.y+" ");
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