import java.util.*;
public class sqrt {
static Scanner sc = new Scanner(System.in);
    
public static void main(String[] args) {
    

}

static double sqrt1(double n){

    int i=1;
    while(true){
     if(i*i==n) return n;
     if(i*i>n) return dp(n,i-1,i); 
     i++;
     }

}
static double dp(double n,double i,double j){

  double mid=i+(j-i)/2;

  do{
  if(mid*mid==n) return mid; 
  if(mid*mid>n) j=mid; 
   else i=mid;
  }while(mid-n<0.999);


return mid;
}



}
