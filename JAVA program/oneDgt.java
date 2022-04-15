public class oneDgt {
    
    public static void main(String[] args) {
        
    }

 static boolean chkDgt(String str){

    for(char c:str.toCharArray()){
      if(c>='0'&& c<='9')
               return  true;
       }

        return false;
 }


}
