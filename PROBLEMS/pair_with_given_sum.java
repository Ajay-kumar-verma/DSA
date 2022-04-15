import java.util.*;
public class pair_with_given_sum {
    
public static void main(String[] args) {
    
   int a[]={1, 5, 7, 1};
   int n=a.length;
   int sum=6;
   System.out.println(pairSum1(a,n,sum));
   



}

static int pairSum1(int a[],int n,int k){
//   time complexity n*2 high 
     int c=0;
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(a[i]+a[j]==k)c++; 
      }
  
    }
  
    return c;
}

static int pairSum2(int a[],int n,int k){
     
    // for uniqe ele only 
Arrays.sort(a);
int i=0;int j=n-1;
int c=0;
while(i<j){
  int sum=a[i]+a[j];
    if(sum==k)
    {i++;j--;c++;
    continue;
    }
   else if(sum>k) j--;
   else i++;   
    
}
return c;


}

static int sumPair3(int a[],int n,int k){

    HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
  
    for(int x:a){
        if(!hm.containsKey(x))
           hm.put(x,1);
        else hm.put(x,hm.get(x)+1); 
     } 
 int c=0;
 
 for(int x:a){ 
  if(hm.containsKey(k-x))
    c+=hm.get(k-x);

     if(k==2*x) 
    c--; 

 }

    return c/2;
}
static int sumPair4(int a[],int n,int k){

int c=0;




return c;
}

}
