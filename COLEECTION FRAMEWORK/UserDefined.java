import java.util.*;

public class UserDefined{
static Stack<node> s=new Stack<node>();
  public static void main(String[] args) {

s.add(new node(5,67));
 
node n= new node(25,45);
s.add(n);
s.add(new node(45,23));
s.add(new node(65,12));

System.out.println(s.pop().x);


// new ts();

}

}



class ts{

ts(){

// Set<node> set=new HashSet<node>();

  TreeSet<node> set=new TreeSet<node>();
  // LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();

 set.add(new node(4,5));
 set.add(new node(4,7));
 set.add(new node(4,7));

 Iterator<node> i=set.iterator();

 while(i.hasNext()){
  System.out.print(i.next().x+" ");
  } 


}



}



class node{
int x;
int y;
 
node(int x,int  y){
    this.x=x;
    this.y=y;
}

// method overriding   

//  it will compare by y or objects 
public boolean equals(Object o){
  if(this==o) return true;
  if(o==null || getClass()!=o.getClass()) return false;
   node n=(node)o;
  return y==n.y; 
}



//  According to y hashCode gets generated 
// method overriding 
public int hashCode(){
  return Objects.hash(y);
}



}
