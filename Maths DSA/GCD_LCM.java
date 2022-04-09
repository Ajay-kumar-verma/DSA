import java.util.Scanner;

public class GCD_LCM{
static Scanner sc= new Scanner(System.in);
public static void main(String[] args) {

  System.out.print("Enter first number : "); 
  int a=sc.nextInt();

  System.out.print("Enter second number : "); 
  int b=sc.nextInt();
  
  System.out.println("GCD IS : "+gcd1(a,b));

}
// BEST WAY 
static int gcd1(int a,int b){
 if(b==0) return a;
 return gcd1(b,a%b);

//  if(a==0) return b;
//  return gcd1(b%a,a);
} 

static int gcd2(int a,int b){

   if(a==0) return b;
   if(b>a)
   return gcd2(b-a,a);
   else
   return gcd2(a-b,a);
   
}

static int gcd3(int a,int b){
if(a<0 || b<0 ) return 0;

  int min=a>b?b:a;
for(int i=min;i>0;i--){
    if(a%i==0 && b%i==0)
      return i;
}
return 0;
}

}