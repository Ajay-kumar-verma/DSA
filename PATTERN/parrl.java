import java.util.*;
public class parrl{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
  while(true)
   p(sc.nextInt());


    }
static void p(int n){
     
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
      if(i==j-2 ||i==j+2 || i+j==n-3||i+j==n+1)   
       System.out.print("#"+" ");
      else  System.out.print(" "+" ");
    }
  System.out.println();
}


}

}
