public class bitchange {
public static void main(String[] args) {
// we can get each bit and we can compare each bit if different coutn ++

    int a=5;
    int b=6; 
System.out.println(f(a,b));

}
// xor make bit wise calculation 
//  it set 1 for differnt bit at that pos 
// and 0 for same bit   
 
static int f(int a,int b){
    int xor=a^b;
  int c=0;
    while(xor>0){
      c++;
      xor=xor&(xor-1);
  }
  
return c;


}



}
