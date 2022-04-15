public class shft {
    
public static void main(String[] args) {
    int a[]={0,4,-9,-4,6,3,-43,98};
    int n=a.length;
    shf(a,n);
    for(int x:a) 
     System.out.print(x+" ");  



}
    public void segregateElements(int arr[], int n)
    {
     int t=0;
     int a[]=new int[n];
     for(int x:arr){
         if(x>=0) a[t++]=x; 
     }
     for(int x:arr){
         if(x<0) a[t++]=x; 
         
     }
         int i=0;
        for(int x: a){
            arr[i++]=x;
        }  
          
    // it take extra space it maintain order 
    // all negative left side with same order    
}


    static void shiftR(int a[])
    {
    
       int k=-1;
       int n=a.length;
       for(int i=0;i<n;i++){
           if(a[i]!=0)   
            {
              k++;
              int temp=a[i];
              a[i]=a[k];
              a[k]=temp;
            }
         }
     
         System.out.println("last swaped "+k);
        }
    
    
    static void shiftL(int a[])
    {
       int k=-1;
       int n=a.length;
       for(int i=0;i<n;i++){
           if(a[i]==0)   
            {
              k++;
              int temp=a[i];
              a[i]=a[k];
              a[k]=temp;
            }
         }
         System.out.println("last swaped "+k);
       }
       
static void shift(int a[])
{

   int k=-1;
   int n=a.length;
   int pivot=a[n-1]; 
   for(int i=0;i<n;i++){
      if(a[i]<pivot)
      {
         k++;
         int temp=a[i];
         a[i]=a[k];
         a[k]=temp;
        
      }
    }

    // int temp=a[k+1];
    // a[k+1]=a[n-1];
    // a[n-1]=temp;

 System.out.println("Last swapped "+(k+1));   
}

static void shf(int a[],int n){
  int i=0;
  int j=n-1;
 
  while(i<j){
     while(a[i]>=0)
        i++;
    while(a[j]<0)
     j--;
     if(i<j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
     } 

  }



}


}