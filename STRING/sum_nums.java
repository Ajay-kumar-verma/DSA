public class sum_nums {
    
public static void main(String args[]){
String s1="6";
String s2="2";

s1=new StringBuilder(s1).reverse().toString();
s2=new StringBuilder(s2).reverse().toString();
String sm= sub(s1,s2);
System.out.println(new StringBuilder(sm).reverse().toString());;

}

static String  sum(String s1,String s2){

    StringBuilder s=new StringBuilder(); 
    int n1=s1.length();;
    int n2=s2.length();;
     int i=0;
     int j=0;
     int c=0;
     while(i<n1 && j<n2){
      int sm=(int)s1.charAt(i)-'0'+(int)s2.charAt(j) -'0'+c;
      int r=sm%10;   
        c=sm/10;
     s.append((char)(r+'0'));
     i++;j++;
    } 
 
    while(i<n1){
      int sm=(int)s1.charAt(i)-'0'+c;
      int r=sm%10;   
      c=sm/10;
      s.append((char)(r+'0'));
        i++;
     }

     
    while(j<n2){
        int sm=(int)s2.charAt(j)-'0'+c;
        int r=sm%10;   
        c=sm/10;
        s.append((char)(r+'0'));
      j++;  
    }
  
if(c>0)
 s.append(c);

    //   System.out.println(s+"result");
    return new String(s);
}



static String  sub(String s1,String s2){

    StringBuilder s=new StringBuilder(); 
    int n1=s1.length();;
    int n2=s2.length();;
    if(n1<n2){
       String t=s1;
       s1=s2;
       s2=t;
     } 
     int i=0;
     int j=0;
     int b=0;

     while(i<n1 && j<n2){
      int sb=(int)s1.charAt(i)-'0'+b  -(int)s2.charAt(j) -'0';
         if(sb<0){
            sb+=10;
            b=-1;
         }else{
             b=0;
         } 
         s.append((char)(sb+'0'));
     i++;j++;
    } 
 
    System.out.println(s);
    while(i<n1){
      int sb=(int)s1.charAt(i)-'0'+b;
      if(sb<0){
        sb+=10;
        b=-1;
     }else{
         b=0;
     } 
     s.append((char)(sb+'0'));
    i++;
 }
   
  if(n1<n2)
   s.append(-1);

    //   System.out.println(s+"result");
    return new String(s);
}



}
