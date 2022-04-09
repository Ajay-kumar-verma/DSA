public class sfting {
    
    public static void main(String[] args) {
      int a[]={1,0,0,3,-1,4,5,0,0,5,-0,0};
        
    
    int i=0; int j=a.length-1;

    while(i<j){
       while(a[i]==0)i++;
       while(a[j]!=0)j--; 
       
  
      int  t=a[i];
      a[i] =a[j];
      a[j]=t;
      i++;j--;
     
    }


    for(int x:a)
    System.out.print(x+" ");


    }
}
