import java.util.*;
public class recursion{
 static Stack<Integer> sk=new Stack<Integer>();
public static void main(String[] args) {
 
asc(7);

}
  

// static void asc(int n){
   
//   while(n>0){
//        if(n%2==1)
//        System.out.print(n+" ");
//      sk.push(n--);
// }
 
//     while(!sk.isEmpty()){
//         int x=sk.pop();
//         if(x%2==0)
//       System.out.print(x+" ");;
  
//     }


// }


static void asc(int n){
  if(n==0) return; 
  
  if(n%2==1)
  System.out.print(n+" ");
  
// this part will execute whiling caling itself 
// below part will execute whiling coming back to main  
  asc(n-1); 
  if(n%2==0)
  System.out.print(n+" ");
  
}

}