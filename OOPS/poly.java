package OOP;
// compile time or static type polymophism
public class poly {

public static void main(String[] args) {

System.out.println("I AM MAIN METHOD ...");
//  method overloading...
// compile time or static type polymophism

System.out.println("I"+"ME ");
System.out.println(45+7);
System.out.println(" ");

Area(4);
Area(5,6);

}    

//It's good and sensitive Example    
//it is method overloading and polymorphism 



// polymorphism can't achieved by different return type

public static void Area(int size)
{
 System.out.println("Area of Square is : "+size*size);
}

public static void Area(int a,int b)
{
    System.out.println("Area of Rectangle is : "+a*b);
}

}
