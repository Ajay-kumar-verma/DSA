import java.util.*;
public class chk_all_dgt {

    public static void main(String[] args) {
        String str = "Geeks12345for69708";
    
        System.out.println(allDgt(str));



    }

    static boolean allDgt(String str){
// we can store data into set as well 
// and check wheather all gidit are present or not 
        HashMap<Character,Boolean> hm=new HashMap<Character,Boolean>();

     for(int i=0;i<str.length();i++){
        if(str.charAt(i)<='9' && str.charAt(i)>='0')
             hm.put(str.charAt(i),true);
      }  
        
     for(int i=0;i<=9;i++){
        if(hm.get((char)(i+'0'))) continue; 
         
         if(hm.get((char)(i+'0'))==null)
           return false;

     } 
   return true;
    }





}
