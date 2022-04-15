public class all_posible_pair{

    public static void main(String[] args) {
     int a[]={1,2,3};
       int n=a.length;
// int sum =0;
       for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
            // sum+=a[i];
            // sum+=a[j];
            String pair=a[i]+":"+a[j]+" ";
            System.out.print(pair);

         }
     }
    //  System.out.print("\n"+sum);   

    }



}