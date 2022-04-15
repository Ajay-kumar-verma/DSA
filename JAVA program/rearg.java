import java.util.*;
public class rearg {
 public static void main(String[] args) {
     
    int arr[]={5,4,3,1,2,-1,2,1};
    int n=arr.length;
    System.out.println(Arrays.toString(reArng(arr,n)));

    }

public static int[] Rearrange (int arr[], int n) {
  Set<Integer> s=new HashSet<Integer>();
  for(int x:arr)
     s.add(x);

for(int i=0; i<n;i++){
     if(s.contains(i))
        arr[i]=i;
  else arr[i]=-1;
   }
   return arr;      
    
}


static int [] reArng(int arr[], int n){


for(int i=0;i<n;i++){
  
   if(arr[i]>=0){
      int pos=arr[i];
     int t=arr[pos];
      arr[pos]=pos;
      arr[i]=t;
}else{
    arr[i]=-1;
}
}
 return arr;


}



}
