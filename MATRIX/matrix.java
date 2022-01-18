import java.util.Scanner;
public class  matrix{
public static void main(String args[])
{

     // READING MATRIX 
     Scanner sc= new Scanner(System.in);

     System.out.print("Enter rows : ");
       int r= sc.nextInt();
    System.out.print("Enter cols : ");
       int c= sc.nextInt();
    int m[][]=new int[r][c];
   
    for(int i=0;i<r;i++){
     int row=i+1;
    System.out.print("Enter " +row+ " row : ");
    for(int j=0;j<c;j++)
          m[i][j]=sc.nextInt();              
  
   }

//  PRINTING OUTPUT   OR TRAVERSING 
   System.out.println("Marix is : ");
for(int i=0;i<r;i++){
System.out.print("\t");
    for(int j=0;j<c;j++)
       {System.out.print(m[i][j]+" ");}

 System.out.println();  
       
}



System.out.print("Enter key ele to search : ");
int key=sc.nextInt();;
sc.close();


// TRAVESING IN SORTED MATRIX 
// 1 WAYS  from top right
// 2 WAYS  from bottom left 

int i=0; //top 
int j=c-1; // right

boolean found=false;
while(i< r-1 && j >=0 )
 {
   if(m[i][j]==key)
   { 
       System.out.println(key +" found at "+i+" "+j);   
        found=true;
       break;
   }
   
   if(key > m[i][j] )
   {
       i++;
   }
   

   if(key < m[i][j] )
   {
       j--;
   }
   

 }

if(!found)
{
 System.out.println("not found");
}

}



}