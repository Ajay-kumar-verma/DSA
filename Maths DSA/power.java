import java.util.*;
public class power {
    static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
    
    int a=sc.nextInt();
    int n=sc.nextInt();

System.out.println(p(a,n));

}


// best solution 
static long p(int a,int n){
   if(n==0) return 1;
   if(n%2==0)
   { long k=p(a,n/2);
         return k*k;
   }
  else
  return a*p(a, n-1);
}

}
