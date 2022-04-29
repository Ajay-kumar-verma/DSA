public class samChr {
    
public static void main(String[] args) {

    System.out.println(smchr("227u22"));


}

static boolean smchr(String s)
{
    // using set 
    
    for(int i=0;i<s.length()-1;i++){
      if(s.charAt(i)!=s.charAt(i+1))
         return false;

    }
  return true;


}


}
