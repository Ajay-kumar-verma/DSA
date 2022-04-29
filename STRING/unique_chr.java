public class unique_chr {
    
public static void main(String[] args) {
    // we can use set map
    // we can use two for loop 

   // we can use hashing technique

//    we can update indexed

 String s="ajajmm";

int c[]=new int[26];
  int n=s.length();
  for(int i=0;i<n;i++){
   int ch=s.charAt(i)-'a';
//    System.out.println(ch); 
   c[ch]=c[ch]+1;
 }


for(int i=0;i<26;i++){
   if(c[i]!=0)
        System.out.println((char)(i+'a'));
}
 


}


}
