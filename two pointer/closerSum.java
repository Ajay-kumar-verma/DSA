public class closerSum {
    public static void main(String[] args) {
        
        int ar1[] = {1, 4, 5, 7};
        int ar2[] = {10, 20, 30, 40};
        int x = 38;
         cSum(ar1,ar2,x);
         
    }
   static void  cSum(int a[],int b[],int sum){
     
    int n=a.length;
    int m=b.length;
    int c[]=new int[n+m]; 
    int k=0;
    int i=0;int j=0;
     while(i<n && j<m){
  //  if n=3;and i=2; it execute  
         if(a[i]>b[j]) c[k++]=a[i++];
          else c[k++]=b[j++]; 
    //    i=3;
    //    a[3] not possible 
        }
    while(i<n)
        c[k++]=a[i++];
    while(j<m)
       c[k++]=b[j++];    
 

       i=0;j=n+m-1;
     int d=c[n+m-1];
      int a1=0;int a2=0;
     while(i<=j){
      //   if match keep in memory 
        if(Math.abs(c[i]+c[j]-sum)<d)
      { d=Math.abs(c[i]+c[j]-sum);
         a1=c[i];
         a2=c[j];  
      }

      // keep reaching making closer 
      if(c[i]+c[j]-sum>0)j--;
      else i++; 

     }


System.out.println(a1+":"+a2);



   }  

}
