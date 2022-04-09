package OOP;
public class inheritance_ {
    
public static void main(String args[]){

    // new car();

    vehicle c= new car();
//  it override all method and varibale 

 //  car c= new car();
//  it override method only NOT VARIABLE 


   System.out.println(c.price);
}
}

class vehicle
{
       protected String brand="ford";
       protected int price=456;
       public void horn()
        {
            System.out.println("Tuut ,tuut..!");
        }
}

class car extends vehicle
{
    String carName="Muti";
    int price =678;
   car()
   {
    System.out.println(" Car Name is = "+ this.carName+"\n Brand name is = "+this.brand); 
    System.out.println("Pricre is  = "+super.price);  
   }


}
