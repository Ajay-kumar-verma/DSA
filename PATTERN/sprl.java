import java.util.*;
public class sprl{
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    while(true)
    sp(sc.nextInt());



    }

static void sp(int n){

    int a[][]=new int[n][n];
    int k=1; 
int top=0;
int left=0;
int botm=n-1;
int rgt=n-1; 

while(top<=botm && left<=rgt){
  
 for(int i=left;i<=rgt;i++)
   a[top][i]=k++;   
   top++; 

for(int i=top;i<=botm;i++)
   a[i][rgt]=k++;
 rgt--;  

for(int i=rgt;i>=left;i--)
   a[botm][i]=k++;

botm--;

for(int i=botm;i>=top;i--)
  a[i][left]=k++;

  left++;
 
}

p(a);







}

static void p(int a[][]){

    for(int x[]:a){
     for(int d:x)
      System.out.print(d+" ");

        System.out.println();
    }


}

}