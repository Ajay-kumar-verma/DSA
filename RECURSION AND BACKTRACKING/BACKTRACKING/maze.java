package BACKTRACKING;

import java.util.Scanner;
public class maze {
  //  static StringBuffer path=new StringBuffer();

   public static void main(String[] args) {

   try (Scanner sc = new Scanner(System.in)){
       while(true){  
       int n=sc.nextInt(); 
       int a[][] ={{1,1,1},{1,1,1},{1,0,1}};
       System.out.println(count(0,0,a,n,""));
       }
    }  

   } 
  
 static int count(int r,int d,int[][] a, int n,String path){
    if(r==n ||d==n  || r==-1|| d==-1 ||a[r][d]==0)
     return 0; 
//    path.append(r+""+d+":");
   if(r==n-1 && d==n-1)
    {
       System.out.println(path);
    //    path.delete(0, path.length());
       return 1;
    }
   a[r][d]=0;
int dia=count(r+1,d+1,a,n,path+"Di");
int right=count(r+1,d,a,n,path+"R");
int down=count(r,d+1,a,n,path+"D");
int up=count(r,d-1,a,n,path+"U");
int lt=count(r-1,d,a,n,path+"L");
a[r][d]=1;
return right+down+dia+up+lt;

} 


}
