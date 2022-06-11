import java.util.*;

public class cross{

public static void main(String[] args) {
    
  Scanner sc= new Scanner(System.in);
  while(true)
   c2(sc.next());


}

static void c1(int n){

  for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
       
     if(i==j)
     System.out.print("#"+" ");
     else if(i+j==n-1)
     {  if(i==j) continue;
        System.out.print("@"+" ");
     }
     else
     System.out.print(" "+" ");  
        

    } 
System.out.println();
  }  




} 


static void c2(String s){

    int n=s.length();

    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        
       if(i==j)
       System.out.print(s.charAt(i)+" ");
       else if(i+j==n-1)
       {
        //   if(i==j) continue;
          System.out.print(s.charAt(j)+" ");
       }
       else
       System.out.print(" "+" ");  
          
  
      } 
  System.out.println();
    }  
  
  
  
  
  }

}