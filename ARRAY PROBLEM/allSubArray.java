public class allSubArray {
    
public static void main(String[] args) {
int a[]={4,5,7,3,9};    
int n=a.length;

for(int i=0;i<n;i++){
 for(int j=i;j<n;j++){

     System.out.print("[");
   for(int k=i;k<=j;k++){
   System.out.print(a[k]+" ");
   }
System.out.print("]");
System.out.println(); 
}


}





}




}
