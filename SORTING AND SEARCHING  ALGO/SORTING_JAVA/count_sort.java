public class count_sort{  
public static void main(String args[])
{
 int ar[]={0,1,2,3,4,5,6};
 int max=ar[0];
   for(int x:ar)
    max=(max<x)?x:max; 
 
 int cr[]=new int[max+1];

 for(int x:ar)
   cr[x]++; 

  // print(cr);

// int nr[]=new int[ar.length];
int count=0;
for(int i=0;i<cr.length;i++)
  { if(cr[i]==0) continue;
       
      int no=cr[i];
      while(no-->0){ 
        ar[count++]=i;
      } 

  }
print(ar);


  
}


static void print(int a[]) 
 {
    for(int x:a)
    System.out.print(x+"\t");
    System.out.println();
 }

}  

