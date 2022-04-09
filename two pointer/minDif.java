import java.util.*;
public class minDif {
    
    public static void main(String[] args) {
        
      int A[] = {1, 2, 11, 5};
     
      int B[] = {4, 12, 19, 23, 127, 235};
    
    minDif(A,B);




    }

    static void minDif(int a[],int b[]){
            
       Arrays.sort(a);
       Arrays.sort(b);
  
    int n=a.length;
    int m=b.length;
   int mind=Integer.MAX_VALUE;
int i=0;int j=0;
   while(i<n && j<m){
       
      if(Math.abs(a[i]-b[j])<mind) mind=Math.abs(a[i]-b[j]);
 
      if(a[i]>b[j]) j++;
      else i++;

   }
System.out.println(mind);







    }
}
