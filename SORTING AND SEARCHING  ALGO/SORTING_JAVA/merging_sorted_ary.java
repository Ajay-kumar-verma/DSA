public class merging_sorted_ary {

public static void main(String args[])
 {
       int a[]={1,4,-2,6};
         merge(a,0,1,3); 
 
       for(int x:a)
         System.out.print(x+" ");
 }    

 static void merge(int a[],int l,int m,int r)
   {
    // r is where data is there 
       int n1=m-l+1;
       int n2=r-m;
       
       int L[]=new int[n1];
       int R[]=new int[n2];  
  
        for(int i=0;i<n1;i++)
            L[i]=a[l+i];
        
        for(int i=0;i<n2;i++)
           R[i]=a[m+i+1];
   
        int i=0;int j=0;
        int k=l;
      while(i<n1 && j<n2)
      {
         // for increas 
         if(L[i]<=R[j])   
            a[k++]=L[i++];
         else
          a[k++]=R[j++];      
      }
    
    while(i<n1)
      a[k++]=L[i++];

    while(j<n2)
     a[k++]=R[j++];

   }


}
