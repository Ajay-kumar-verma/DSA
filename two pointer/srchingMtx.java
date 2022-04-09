import java.util.Scanner;
public class srchingMtx {
public static void main(String[] args) {
 
   int m[][]={{1,2,3},{2,3,4},{3,4,5}};
    
   s(m,4);


}


static void s(int a[][],int key){

   // top right
   // bottom left 
   
   int b=a.length-1;
   int l=0;
     
   while(b>=0 && l<a[0].length){
       if(a[b][l]==key){
         System.out.println(key +" found at "+(b+1)+":"+(l+1));return;
        }
       if(a[b][l]>key) b--;
        else l++;
   }

  System.out.println(key+" does not exist !");

    
}


}
