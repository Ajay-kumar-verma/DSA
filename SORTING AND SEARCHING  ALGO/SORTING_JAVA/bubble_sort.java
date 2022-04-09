public class bubble_sort {
    
 public static void main(String[] args) {
    int r[]={6,7,8,3,2,12,5,4};
     sort(r);

 for(int x:r)
     System.out.print(x+" ");

}

// best way solution 
static void  sort(int a[]){
 for(int i=0;i<a.length;i++){
   boolean swp=true; 
   for(int j=0;j<a.length-1;j++){
      if(a[j]>a[j+1]){
           a[j]=a[j]^a[j+1];
           a[j+1]=a[j]^a[j+1];
           a[j]=a[j]^a[j+1];
        swp=false;
         }
                  
   } 
  if(swp) break;

 }
 return ;





}

}
