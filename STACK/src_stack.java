import java.util.*;
public class src_stack{

public static void main(String args[]){

Stack<Integer> s=new Stack<Integer>();

s.push(4);
s.push(-1);
s.push(-1);
s.push(-8);
s.push(9);

  srch(s,9);
}


static void srch(Stack<Integer> s,int key){
   if(s.isEmpty()) 
   {
   System.out.println("Stack empty");
     return;
   }
   if(s.peek()==key)
    {
    System.out.println(key +" is found in stack ");
     return;
   }
  
int ele=s.pop();
srch(s,key); 
s.push(ele);

}


// static void  sort(Stack<Integer> s,int ele){

//     if(s.isEmpty() || s.peek()>=ele){
//         s.push(ele);
//        return;
//     } 
    
//     int data=s.pop();
//     // int lrg=data>ele?data:ele; 
//     // data= data<ele?data:ele;
//     sort(s, ele);
//      s.push(data);
//   }




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