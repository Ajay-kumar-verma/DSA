public class shft_zero {
public static void main(String args[])
{
 int a[]={0,1,0,0,1,4,0,20,10,13,0,100};

//  shiftR(a);
 shiftL(a);
 
 for(int x:a)
   System.out.print(x+" ");
        
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



   //  End of class 
}








