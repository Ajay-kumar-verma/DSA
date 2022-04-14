public class bitCount {
 
    public static void main(String[] args) {
//  we can use in built method 
  int n=7;        
System.out.println(Integer.bitCount(n));
System.out.println(bC(n));
System.out.println(bC1(n));
System.out.println(bC2(n));
System.out.println(bC3(n));
System.out.println(bC4(n));


}

static int bC(int n){
//   checking each bit form left side  

      int c=0;
      while(n>0){
         c=c+(n&1);  // it check right most bit wheather 1 or 0 
         n=n>>1; 
      }
    return c;
}

static int bC1(int n){
    if(n==0) return 0;
    return (n&1)+bC1(n>>1); 
}

// Algo
static int bC2(int n){
    if(n==0) return 0; 
  return 1+bC2(n&(n-1));
 }

static int bC3(int n){

    int c=0;
    while(n>0){
       c++;
       n=n&(n-1);
    }
return c;
}


// we can divide by 2 and check each time wheather 1 is there or not 
 
// this is very use full use in checking  digit count in any number formnat  
static  int bC4(int n){
     if(n==0) return 0;
  
  int o=0;
  int z=0;
  while(n>0){
     if(n%2==1)o++; 
      else z++;
     n=n/2;  
     }

  return o; 

} 

}
