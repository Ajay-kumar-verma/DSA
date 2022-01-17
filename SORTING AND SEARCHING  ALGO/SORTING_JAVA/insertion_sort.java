public class insert_sort{

    public static void main(String[] args){

  int r[]={6,7,8,3,2,12,5,4};
       
    
     sort(r);

  for(int x:r){
      System.out.print(x+" ");
  }


    }



static void  sort(int a[]){
for(int i=1;i<a.length;i++){
  int j=i-1;
  int  ele=a[i];
   while(j>=0 && a[j]>ele){
      a[j+1]=a[j]; 
       j--;
   }
  a[j+1]=ele;
}
return ;
}



}