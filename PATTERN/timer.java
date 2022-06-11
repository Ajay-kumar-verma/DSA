import java.util.*;
public class timer {
   public static void main(String[] args) {
   
  Scanner sc= new Scanner(System.in);

   while(true)  
   p2(sc.nextInt());

}

static void p1(int n){

  for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        if(i<=j & i+j<=n+1) // i<=j || i+j<=n+1
         System.out.print("#"+" ");
        else System.out.print(" "+" ");
      }
  System.out.println("");
  if(i==n/2+1)
   break;

 }
}

static void p2(int n){


    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
          if(i<=j & i+j<=n+1) // i<=j || i+j<=n+1
           System.out.print(" "+" ");
          else System.out.print("#"+" ");
        }
    System.out.println("");
    if(i==n/2+1)
     break;
  
   }



}

}
