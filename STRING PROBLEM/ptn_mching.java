import java.util.*;
public class ptn_mching{

    static Scanner sc= new Scanner(System.in);
public static void main(String[] args) {
    
System.out.print("Enter string : ");
String str=sc.next();
System.out.print("Enter sub :");
 String sub=sc.next();
 System.out.println(mtch(str,sub));
}


static boolean mtch(String str,String sub){
  int len1=str.length();
  int len2=sub.length();

  if(len1<len2) return false;

  int k=0;
  int i=0;
  for(i=0;i<=len1-len2;i++){
   if(str.charAt(k)!=sub.charAt(i)) continue;
    
   while(k<len2)
    if(str.charAt(i++)!=sub.charAt(k++))
                 return false;
  
   if(k==len2) return true;
    
   
  }
  
   return false;


}

}