public class bubble_sort {
    
 public static void main(String[] args) {
    int r[]={6,7,8,3,2,12,5,4};
   //   sort(r);
  new bble();

//  for(int x:r)
   //   System.out.print(x+" ");

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

class bble{
  
   bble(){
    int a[]={4,3,1,6,5,4,1};
    int n=a.length;
   //  max(a,n,0);
   bS(a,n); 

   for(int x:a)
     System.out.print(x+" ");
     

   }


   static void bS(int a[],int n){
     if(n==1) return ;
    
      for(int i=0;i<n-1;i++){
          if(a[i]>a[i+1]){
             int t=a[i];
             a[i]=a[i+1];
             a[i+1]=t;   
          }

      }

     bS(a,--n);

   }


static void max(int a[],int p){
   int n=a.length;
   if(n-1==p)
     return;
    int x=a[p];
    int y=a[p+1];
     
    a[p+1]=(x>y)?x:y;  
    a[p]=(x<y)?x:y;  
        
   max(a,p+1); 
}


}

