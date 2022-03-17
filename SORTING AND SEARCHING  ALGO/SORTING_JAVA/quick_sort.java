
public class quick_sort {

    public static void main(String args[])
     {
         
   int a[]={6,3,41,1,-2,6,7,4};
 
    sort(a,0,a.length-1);

        for(int x:a)
     System.out.print(x+" ");


     }

 static void sort(int a[],int low ,int high)
    {
      if(low<high) {
 
        int pivot=partion(a,low,high);
        // System.out.println(pivot);     
          sort(a,low,pivot-1);
          sort(a,pivot+1,high);
    
          }
      }  

    static int partion(int a[],int low,int high)
  {
    
     int k=low;
     int pivot=a[high]; 
     for(int i=low;i<=high;i++){
        if(a[i]<pivot)
        {
          int temp=a[i];
          a[i]=a[k];
          a[k]=temp;
          k++;
        }
      }
   int temp=a[high];
   a[high]=a[k];
   a[k]=temp;

   return k;
  }





}
