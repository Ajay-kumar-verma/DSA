import java.util.*;
public class modulu {
static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    
       int num =sc.nextInt();
       int div=sc.nextInt();
       System.out.println(m(num,div)); 
    }

    // best way 
static int m(int a,int b)
       {return a%b;}

static int m1(int a,int b){

return a- b*(a/b);

} 

static int m2(int a,int b){

 while(a>b)
   a-=b;
 
return b;


}

}
