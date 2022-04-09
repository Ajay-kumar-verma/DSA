import java.util.Scanner;
public class prime_no {
    static Scanner sc= new Scanner(System.in);
public static void main(String[] args) {
    System.out.print("Enter number :");
    int n= sc.nextInt();
    System.out.println(n+" is a prime no : "+prime1(n));
}

static boolean prime1(int n){
if(n<2) return false; 
for(int i=2;i*i<=n;i++){
    if(n%i==0)
      return false;

}
return true;

}

static boolean prime2(int n){
  
    if(n<2) return false; 
    for(int i=2;i<n;i++){
        if(n%i==0)
          return false;
    
    }
    return true;
    
    }
    

}
