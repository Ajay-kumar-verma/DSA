public class fib{

// for n -bonacci we will having n initial term  


public static void main(String[] args) {
    

    for(int i=1;i<=10;i++){
        System.out.print(t(i)+" ");

    }
    System.out.println();
}

static long f(int n){
    if(n<1) return Integer.MAX_VALUE;
  int a1=0;
  int a2=1;
  if(n==1) return a1;
  if(n==2) return a2;

 return f(n-1)+f(n-2);

}

static long t(int n){
  if(n<1) return Integer.MAX_VALUE;
  int a1=0;
  int a2=0;
  int a3 =1;
  if(n==1) return a1;
  if(n==2) return a2;
  if(n==3) return a3; 
  
  return t(n-1)+t(n-2)+t(n-3);


}

}