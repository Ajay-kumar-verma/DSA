import java.util.*;
public class pangram {
    public static void main(String[] args) {
    
        System.out.println(pgm("The quickrown b fox jumps over the lazy dog"));
    }


    static boolean pgm(String s){
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
  
  for(boolean i:b){
       if(!i) return i;
  }
  return true;


    }
}
