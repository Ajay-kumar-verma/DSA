import java.util.*;
public class diagonal{
public static void main(String arg[]){

  Scanner sc=new Scanner(System.in);
   while(true)  
  dia1(sc.nextInt());

}

static void dia1(int n){
   
    int t=n;
    n=n%2==0?--n:n;

    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            
           if(i==j || j+i==n-1) System.out.print("*");     
           else  System.out.print("x");

        }
  System.out.println();
    }
 
}

}