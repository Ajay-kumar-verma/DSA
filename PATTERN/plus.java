import java.util.*;
public class plus {
 
    public static void main(String[] args) {
        
Scanner sc= new Scanner(System.in);
  while(true)
   p(sc.nextInt());

    }
    static void p(int n){
       
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
      if(i==n/2 || j==n/2 ||i==j || i+j==n-1) // we can add more and more path for different pattern  
       System.out.print("#"+" ");
      else  System.out.print(" "+" ");
    }
  System.out.println();
}



    }

    
}
