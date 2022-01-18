import java.util.*;
import java.lang.*;
import java.io.*;

class w {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=0;
        t=sc.nextInt();
		while(t-->0)
		    {
		        String str1=sc.next();
		        String str2=sc.next();
		        
		        int w1=0;
		        int w2=0;
		        
		        for(int i=0;i<str1.length();i++){
		            w1+=str1.charAt(i)-'a'+1;
		        }
		        
		        
		        for(int i=0;i<str2.length();i++){
		            w2+=str2.charAt(i)-'a'+1;
		        }
		        
		      
		        if(w1>w2)
		        System.out.println(1);
		        else if(w2>w1)
		         System.out.println(2);
		        else
		        System.out.println("equal");
		    }
		
		
		
		
	}
}