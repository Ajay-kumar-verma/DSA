 
public class palidn {
    public static void main(String[] args) {
        
  System.out.println(p(Integer.toString(12321)));   
  System.out.println(p(String.valueOf("racecar")));
   

    }

   static boolean p(String s){
     int i=0;int j=s.length()-1;

     while(i<j)
   { if(s.charAt(i)!=s.charAt(j)) return false;
      else{i++;j--;}
   }
 return true;
   }
  



}
