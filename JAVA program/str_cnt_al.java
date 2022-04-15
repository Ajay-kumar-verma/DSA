public class str_cnt_al{
public static void main(String[] args) {
    



}


static boolean chek(String str){
    if(str==null || str.equals(""))
         return false;
         
     for(int i=0;i<str.length();i++){
        int ch=str.charAt(i);
        if(ch<'A' || ch>'Z')
           return false;

     }    
return true;
}

}