public class pairSum{
public static void main(String[] args) {

    int arr[] = { 2, 3, 5, 8, 9, 10, 11 };
     System.out.print("pairSum is = "+isPair(arr,arr.length,9));    

}

// it reduces the time complexity 
static Boolean isPair(int a[],int n,int sum){
   int i=0;
   int j=n-1;
   
   while(i<=j){
      if(a[i]+a[j]==sum) return true;
      if(a[i]+a[j]>sum) j--;
      if(a[i]+a[j]<sum) i++;
     }
    return false;
}

// there is another way brute force method  

}