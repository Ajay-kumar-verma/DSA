import java.util.*;

public class parenthetis_matching {
    

public static void main(String args[]){
 
    for(;;)
     {
    System.out.print("Enter expression : ");
    Scanner sc= new Scanner(System.in); 
    String str=sc.next();
    System.out.println(para(str));

     }


}

static String para(String str)
  {
   Stack<Character> s=new Stack<Character>();
  for(int i=0;i<str.length();i++){
      if(Character.isDigit(str.charAt(i)))
         continue;  
       
      if(str.charAt(i)=='(' || str.charAt(i)=='{' ||str.charAt(i)=='[')
          s.push(str.charAt(i));

     else if(str.charAt(i)==')' || str.charAt(i)=='}' ||str.charAt(i)==']')
        {   if(s.isEmpty())
            return "Invalid Expression";
           else  if(s.peek()=='(' && str.charAt(i)==')' || s.peek()=='{'  && str.charAt(i)=='}' ||s.peek()=='['  && str.charAt(i)==']' )
             s.pop();
            else
              return "Invalid Expression";
     
        }

  }

  
  if(s.isEmpty())
    return "valid expression";
  else 
    return "invalid expression";

  }



}
