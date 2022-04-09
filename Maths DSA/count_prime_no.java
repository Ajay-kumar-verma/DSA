import java.util.*;
public class count_prime_no {
    
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
    
        System.out.print("Enter no :");
        int n= sc.nextInt();
       
        int a[]=new int[n+1];
        Arrays.fill(a,1);
        
        int cnt=0;
     for(int i=2;i<n;i++){
        if(a[i]==1){
             cnt++;
           int k=1;  
        while(k*i<n)
           a[i*k++]=0;
         
        }
     

     }
System.out.println("total prime no is : " +cnt);

    }







}
