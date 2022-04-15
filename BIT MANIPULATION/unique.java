public class unique {
    
public static void main(String[] args) {
    // non repeating ele 
   // we can use set and map 

    // if there is present any one number odd number of times 
    int a[] ={2,3,4,5,5,4,2};
  System.out.println(getnum(a));

}


static int getnum(int a[]){
    // uqinge number gets remain 
    // xor of sam enumber is 0 
   int xor=0;
   for(int x:a)
      xor=xor^x;
   return xor;   
 }



}
