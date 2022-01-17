
public class selection_sort {
 public static void main(String[] args) {
    int r[]={6,7,8,3,2,12,5,4};
     sort(r);

 for(int x:r)
     System.out.print(x+" ");

}

static void  sort(int a[]){
 for(int i=0;i<a.length;i++){
   int minIndex=i;

   for(int j=i+1;j<a.length;j++){
      if(a[minIndex]>a[j])
            minIndex=j;        
   } 
  int temp= a[i];
  a[i]=a[minIndex];
  a[minIndex]=temp;
  
 }
 return ;





}

}
