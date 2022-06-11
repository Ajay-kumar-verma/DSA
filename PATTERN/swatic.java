import java.util.*;
public class swatic {
  public static void main(String[] args) {
            
Scanner sc= new Scanner(System.in);
while(true)
 s(sc.nextInt());



  }

    static void s(int n){
 
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
             if((j>n/2 && i==0 )|| (j<n/2 && i==n-1 ) || j==n/2  || i==n/2 || (j>n/2 && i==0 )|| (i>n/2 && j==n-1) || (i<n/2 && j==0))
              System.out.print("#"+" ");
             else System.out.print(" "+" ");

            }
System.out.println();
        }

    }

}
