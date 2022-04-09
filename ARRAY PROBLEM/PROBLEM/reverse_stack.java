import java.util.*;
public class reverse_stack{

    public static void main(String [] args)
    {
  
        Stack<Integer> s=new Stack<>();
        
        s.push(5);
        s.push(8);
        s.push(9);
        s.push(6);
     System.out.println(s); 
     reverse(s);
     System.out.println(s); 
     
Iterator<Integer>  i=s.iterator();



while(i.hasNext()){
System.out.println(i.next());

}


    }


static void reverse(Stack<Integer> s){

     if(s.isEmpty())
        return;

    int ele=s.pop();
     reverse(s);
   insert_at_bottom(s,ele);   


return;

}

static void insert_at_bottom(Stack<Integer> s,int ele)
{
  if(s.isEmpty())
   {s.push(ele);
     return;
 }
    int top=s.pop();
    insert_at_bottom(s,ele);
   
     s.push(top);
   


}





}