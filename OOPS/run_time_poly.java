package OOP;
// RUN TIME OR DYNAMIC POLYMORPHISM
// VARIABLE OVERRIDING IS NOT THERE IN JAVA
public class run_time_poly {
    
public static void main(String args[])
  {
   A a= new A();
   B b= new B();
   C c= new C();
   
   a.p();
   b.p();
   c.p();
       
//  A is a parents class here 
  
a=b;
a.p(); 
}
}


class A
{
  public void p()
  {
    System.out.println("I AM INSIDE A ");
  }

}



class  B extends A
{
  public void p()
  {
    System.out.println("I AM INSIDE B ");
  }

}



class  C extends A
{
  public void p()
  {
    System.out.println("I AM INSIDE C ");
  }

}
