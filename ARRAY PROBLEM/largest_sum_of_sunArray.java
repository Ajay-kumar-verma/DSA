public class largest_sum_of_sunArray {
public static void main(String[] args) {
    // Brute  force approach 

    // getiing all posiible sunArrays and getiing sum 
    // we can track max sum or min sum 
    

    // Here an algo kadane algo
   //  in while traversing  array we can track max sum
   // and sum so far if zero start from next point  
  int a[]={-3,15,-13,7,-6,-4,32,789};


  int max=Integer.MIN_VALUE;
  int sum=0;
   for(int i:a)
   { 
    sum+=i; // sum so far 
    
    if(max<sum)  // storing max sum 
      max=sum;

   if(sum<0)  // if negative reset 
     sum=0;   
 
    }  

System.out.println(max);


}



}
