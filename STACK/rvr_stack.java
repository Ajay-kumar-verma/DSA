import java.util.*;
public class rvr_stack{
public static void main(String args[]){

Stack<Integer> s=new Stack<Integer>();

s.push(4);
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
atLast(s,ele);
}


// static void  sort(Stack<Integer> s,int ele){
//     if(s.isEmpty()){
//         s.push(ele);
//        return;
//     } 
//     int data=s.pop();
//     int lrg=data>ele?data:ele; 
//     data= data<ele?data:ele;
//     sort(s, lrg);
//      s.push(data);
//     }

  
static void  atLast(Stack<Integer> s,int ele){

   if(s.isEmpty()){
       s.push(ele);
    return;
    } 
        
   int data=s.pop();  
   atLast(s, ele);
   s.push(data);

  }


 }