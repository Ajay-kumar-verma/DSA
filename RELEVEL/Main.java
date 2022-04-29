import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	 Scanner sc=new Scanner(System.in);
	  int t=sc.nextInt();
	  while(t-->0){
         int n= sc.nextInt();
		 long A[]=new long[n];
       for(int i=0;i<n;i++){
          A[i]=sc.nextInt();
	   }
    ArrayList<Long> usdata=new ArrayList<Long>(); 

   int cnt=0;

     for(int i=0;i<n;i++){
		  
		for(int j=i+1;j<n;j++){
    	long sum=A[i]+A[j];
		if(p_of_2(sum)){
           	// System.out.println(A[i]+":"+A[j]);
		   cnt++;
			 usdata.add(A[j]);
         usdata.add(A[i]);

		
		// // System.out.println(cnt);
		// 
	}
      
		  
		 }
	 }

	 System.out.println(cnt);



	  }
	
	
	}

static boolean p_of_2(long n){

	while(true){
		if(n==1) return true;
		if(n%2!=0) return false; 
        n=n/2;  
        }
 	
}


}


