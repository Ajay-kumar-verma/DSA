package BACKTRACKING;
import java.util.*;
public class wordSearch {
    public static void main(String[] args) {
     
        Scanner sc= new Scanner(System.in);

   while(true){
    System.out.print("Enter rows : ");
     int r= sc.nextInt();
   System.out.print("Enter cols : ");
     int c= sc.nextInt();
   char [][]a= new char[r][c]; 

    for(int i=0;i<r;i++)
        for(int j=0;j<c;j++)
           a[i][j]=sc.next().charAt(0);
        

      System.out.println();     
       System.out.print("Enter words ");
       String w=sc.next();
           
       s(a,w);
}
    }


 static boolean srch(char [][] box,int r,int c,String w,int i){
    System.out.println(r+":"+c+":"+i);
  
    if( r==-1||c==-1|| box.length==r || box[0].length==c || box[r][c]=='0' || w.length()==i)
  {
  System.out.println(r+":"+c+":"+i);
    return false;
 
  }  
    
    if(box[r][c]!=w.charAt(i))
     return false;

     if(box[r][c]==w.charAt(i) && w.length()==i+1)
     return true;

      char t=box[r][c];
      box[r][c]='0';

    boolean x= srch(box,r+1,c,w,i+1) || srch(box,r-1,c,w,i+1) || srch(box,r,c+1,w,i+1)||srch(box,r,c-1,w,i+1);
    box[r][c]=t;      
    return x;    
}

static void s(char [][]m,String w){
    
  int r=-1,c=-1;

  for(char ch[]:m){
    r++; c=-1;
    for(char x:ch){
        c++;
        if(x==w.charAt(0))
         {
            
           System.out.println(srch(m,r,c,w,0)+":"+r+":"+c); 
           return ;
        }
     }

  }
     




}



}
