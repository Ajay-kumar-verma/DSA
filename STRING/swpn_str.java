public class swpn_str{

 public static void main(String [] args){
    // we cancatenate 

   String s1="AJay";
   String  s2="kumar";

  int len1=s1.length();
  int len2=s2.length();

    s1=s1+s2;
    s2=s1.substring(0,len1);
    s1=s1.substring(len1, len1+len2);
    System.out.println(s1+" "+s2);

 }
 

}