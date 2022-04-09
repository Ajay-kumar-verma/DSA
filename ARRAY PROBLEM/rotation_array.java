public class rotation_array {
    

public static void main(String args[]){

int ar[]={3,5,6,3,1,5,7,8,9};
 int n=ar.length;
int nwar[]=new int[n];
    
int k=2;

// clockWise rotation 
for(int i=0;i<n;i++){
  nwar[(i+k)%n]=ar[i];
} 

// Anti-clockWise rotation 
for(int i=0;i<n;i++){
    nwar[(i-k+n)%n]=ar[i];
  } 
  



 for(int x:nwar)
   System.out.print(x + " ");

 


}



}
