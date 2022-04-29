import java.util.*;
public class msng_chr {

    public static void main(String[] args) {
        

        System.out.println(pgm("The quickrown b f jug"));


    }

    
 static String pgm(String s){
   
        Boolean b[]=new Boolean[26];
        Arrays.fill(b,false);  
        int  ind=0;
        for(int i=0;i<s.length();i++){
         char c=s.charAt(i); 
         if(c>='A' && c<='Z')
             ind= (int)(c-'A');
      
          if(c>='a' && c<='z')
          ind= (int)(c-'a');
          
          b[ind]=true;  
        }

      String rs="";  
      for(int i=0;i<26;i++){

          if(!b[i]){
            rs+=(char)(i+'a');
 }
         

      }  

    return rs;
  
  
      }
  

}
