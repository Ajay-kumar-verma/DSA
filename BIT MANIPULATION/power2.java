public class power2 {
    
public static void main(String[] args) {
    

   int a=2;
   int n=14;
   System.out.println(p(a,n));
   System.out.println(chkP(9));
   System.out.println(chkP1(16));
   System.out.println(chkP(9));
  
   
}

static long p(int a,int n){
   
        if(n==0) return 1;
    while(n-->1){
         a=a<<1;
    }
    
return a;

} 

static boolean chkP(int n){
 
    int k=1;
while(k<=n){
    if(k==n) return true;
     k<<=1;

}
 return false;

}

static boolean chkP1(int n){
  
    while(n!=1){
      if(n%2!=0) return false;
         n=n/2;
        }

return true;



}



}
