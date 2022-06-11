import java.util.*;

public class spiral{
 public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);
    
    while(true)
    sp(sc.nextInt());

 }

  static void sp(int n){
    n=2*n;

   for(int i=1;i<n;i++){
      for(int j=1;j<n;j++){
        //  int x=min(i,j,2*n-i+1,2*n-j+1);
          int x=min(i,j,(n-i),(n-j));
           
          System.out.print(x+" ");      
      }
   System.out.println();
   }

 }


static int min(int a,int b,int c ,int d){
   return  Math.min(Math.min(a, b),Math.min(c,d));
}

static int max(int a,int b,int c ,int d){
    return  Math.max(Math.max(a, b),Math.max(c,d));
 }
 
}