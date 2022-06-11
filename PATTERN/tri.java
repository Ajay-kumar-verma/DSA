import java.util.*;
public class tri {
    
public static void main(String[] args) {
  Scanner sc= new Scanner(System.in);
  while(true)
    t3(sc.nextInt());   
 
}

static void t1(int n){

 for(int i=1;i<=n;i++){
   for(int j=1;j<=i;j++)
   {
    System.out.print(i+" ");
   }
    
 System.out.println();

 }


}

static void t2(int n){

  for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++)
    {
     if(j<=i) // j>=i //i==j 
      System.out.print(i+" ");
     else System.out.print(" "+" ");
    }
  System.out.println();
  }

}

static void t3(int n){

    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++)
        {
         if(j+i<=n+1) // j>=i //i==j 
          System.out.print(i+" ");
         else System.out.print(" "+" ");
        }
      System.out.println();
      }
    
} 



}
