public class Str_Chr {
    
public static void main(String[] args){

String s="Ajay";

System.out.println(s.charAt(0));
System.out.println(s.charAt(1));

char c[]=s.toCharArray();

for(char x:c)
  System.out.print(x+" ");

  System.out.println("A".charAt(0)+1);

 
 
// String str= new String(c);

String str=String.valueOf(c);
System.out.println(str);

// this method is used for converting any Date type into String 
// String.valueOf()


}

}
