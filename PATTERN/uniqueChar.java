import java.util.*;

public class uniqueChar{
public static void main(String[] args) {

   Scanner sc= new Scanner(System.in);
   String s=sc.next();
   
   HashMap<Character,Integer> c=new HashMap<Character,Integer>();

//    HashMap<Integer,String> hm=new HashMap<Integer,String>();

   // HashMap<Integer,String> map=new HashMap<Integer,String>();

   for(int i=0;i<s.length();i++){
    char ch=s.charAt(i);
     if(c.get(ch)==null){
        c.put(ch,1);
    }
    else{
        c.put(ch,c.get(ch)+1);
       }
       
   }

for(int i=0;i<s.length();i++){
    char ch=s.charAt(i);
    
    if(c.get(ch)==1)
      {
          System.out.println(ch);
        //   return ;
      }     

}


}


}