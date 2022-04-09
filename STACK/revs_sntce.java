import java.util.*;
public class revs_sntce {
    

public static void main(String args[])
 {
  Scanner sc= new Scanner(System.in);
  for(;;)
   {
     String str=sc.nextLine();
   
     System.out.println(rvs(str));

   }




 }

 static String rvs(String str)
   { 
      Stack<String> s=new Stack<String>();
    
      String strr[]=str.split(" ");
     
       for(int i=0;i<strr.length;i++)
       {
         s.push(strr[i]);
       }                 
   
     String newStr="";

     while(!s.isEmpty()){
         newStr+=s.pop()+" ";
     }

    return newStr;
   }

}
