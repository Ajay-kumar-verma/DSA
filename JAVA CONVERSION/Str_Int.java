public class Str_Int{
public static void main(String[] args){

// form String to Integer
//  Integer.parseInt(str)
//  Integer.valueOf(s)

String s="300";
Integer i=Integer.parseInt(s);
System.out.println(i.getClass());
int in=Integer.parseInt(s);
System.out.println(in+45);
System.out.println(Integer.valueOf(s)+20);


// System.out.println(Integer.valueOf("Hel"));

System.out.println("INTEGER TO STRING ........... ");
int x=45;

// It is generally used if we have to display number in textfield
// because everything is displayed as a string in form.

System.out.println(String.valueOf(x).getClass());
System.out.println(Integer.toString(x));


 }

}
