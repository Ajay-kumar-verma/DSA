public class shifting {
    

public static void main(String args[])
  {

   int a[]={4,3,10,1,14,12,16,10};
    shift(a);
    for(int x:a)
     System.out.print(x+" ");
          
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








}
