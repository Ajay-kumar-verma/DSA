public class stg_cmprg {
    
public static void main(String args[]){

// we can cpmare string after converting into char array 
// or by checking cheking indexing value into

String s1=new String("Ajay kumar verma");
String s2=new String("Ajay ku44r verma");

// System.out.println(s1.compareTo(s2));
System.out.println(cpmare(s1,s2));





}


static int cpmare(String s1,String s2){
   
    int len1=s1.length();
    int len2=s2.length();

    if(len1>len2) return  len1-len2;
    if(len1<len2) return len1-len2;    
     
    for(int i=0;i<len1;i++){
       
      if(s1.charAt(i)>s2.charAt(i))
            return s1.charAt(i)-s2.charAt(i);
 
      if(s1.charAt(i)<s2.charAt(i))
       return s1.charAt(i)-s2.charAt(i);
 

    }
      
return 0;


}

}
