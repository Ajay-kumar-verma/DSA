import java.util.*;
public class factorial {
 static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
      int num=sc.nextInt();
        System.out.println(
            "Factorial of " + num
            + " is " + fact(num));
    }    


static int fact(int n)
{
    return (n == 1 || n == 0) ? 1 : n * fact(n - 1);
}

static long f(int n){
    if(n==1 || n==0) return 1;
     return f(n-1)*n; 
}



}
