import java.util.*;
public class sort_stack{

public static void main(String args[]){

Stack<Integer> s=new Stack<Integer>();

s.push(4);
s.push(-1);
s.push(-1);
s.push(-8);
s.push(9);

System.out.println(s.toString());
  reverse(s);
System.out.println(s.toString());
}


static void reverse(Stack<Integer> s){
if(s.isEmpty()) return;
int ele=s.pop();
reverse(s); 
sort(s,ele);

}


static void  sort(Stack<Integer> s,int ele){

    if(s.isEmpty() || s.peek()>=ele){
        s.push(ele);
       return;
    } 
    
    int data=s.pop();
    // int lrg=data>ele?data:ele; 
    // data= data<ele?data:ele;
    sort(s, ele);
     s.push(data);
  }




    // static void  sort(Stack<Integer> s,int ele){

    //     if(s.isEmpty()){
    //         s.push(ele);
    //        return;
    //     } 
        
    //      int data=s.pop();  
    //      sort(s, ele);
    //      s.push(data);
        
    //     }
            










}