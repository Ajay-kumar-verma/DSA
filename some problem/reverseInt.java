import java.util.*;
public class reverseInt{

public static void main(String[] args) {
 
    Scanner sc= new Scanner(System.in);
    while(true)
  System.out.println(reverse(sc.nextInt()));  
}


public static int reverse(int x) {

    int rev=0;
    int rem=0;
   
    
    while(x!=0){
       rem=x%10;  
       System.out.println(rem);
      x=x/10  ;
   if(rev>Integer.MAX_VALUE/10 || rev==Integer.MAX_VALUE/10  && rem>7)
       return 0;
   if(rev<Integer.MIN_VALUE/10 || rev==Integer.MIN_VALUE/10  && rem<-8)
       return 0;
        
        rev=rev*10+rem;
        
    }
    
   return rev; 
    
    
    
}


}