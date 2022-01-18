import java.util.*;
public class reverse{
public static void main(String args[]){

// System.out.print("Enter tests case : ");
Scanner sc= new Scanner(System.in);
int t=sc.nextInt();
// System.out.println("he he he ...");

for(;t-->0;){

// System.out.println("Enter size of Array ");
 int s= sc.nextInt();
int a[]=new int[s];
 
// System.out.println("Enetr array ele : ");
 for(int j=0;j<s;j++)
    a[j]=sc.nextInt();
 

int r[]=new int[s];
for(int k=0;k<s;k++)
  r[k]=a[s-1-k];


//   System.out.println("Reverse array is : ");
  for(int x:r) 
   System.out.print(x+" ");





}



}

}