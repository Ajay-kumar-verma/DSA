public class squ {
    
public static void main(String[] args) {
    int n=3;
    
    System.out.println(p(n));
   System.out.println(square(3));

}


static int p(int n){
   if(n==0) 
   return 0;

   if(n<0) 
   n=-n;
   
   int x=n>>1;
 
   if(n%2!=0)
   return ((p(x)<<2)+(x<<2)+1); 
   else  return (p(x)<<2);
   
  

}


static int square(int n)
{

    // Base case
    if (n == 0)
        return 0;

    // Handle negative number
    if (n < 0)
        n = -n;

    // Get floor(n/2) using
    // right shift
    int x = n >> 1;

    // If n is odd
    
    if (n % 2 != 0)
        return ((square(x) << 2) + (x << 2) + 1);
    else // If n is even
        return (square(x) << 2);
}

}
