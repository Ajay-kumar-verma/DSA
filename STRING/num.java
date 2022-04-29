public class num {
    
public static void main(String[] args) {
    
    String s="123456u7";
System.out.println(ckInt(s));

}

static boolean ckInt(String s){

  for(int i=0;i<s.length();i++)
  { 
//   character.isDigit(c);

      if(!(s.charAt(i)>='0' && s.charAt(i)<='9'))     
               return false;
    }   
 return true;


}

}
