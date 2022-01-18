
public class merge_sort {

    public static void main(String args[]){

       int a[]={4,3,5,2,6,-8};
       
            sort(a,0,5);
    for(int x:a)
       System.out.print(x+" ");

       
    }
    // This is for sorting  
  static void  sort(int a[],int l,int r){
       if(l==r)  return;   
         
      int m=(l+r)/2; 
       sort(a,l,m);
       sort(a,m+1,r);
       merge(a,l,m,r);
  }


  static void  merge(int a[],int l,int m,int r){
    
  int n1=m-l+1;// ele at m considering
  int n2=r-m;  // excluding ele at m  

//   l value shoudnt change at any cost 
  int L[]=new int[n1];
  int R[]=new int[n2];

 
// l value shoudnt change at any cost  
for(int i=0;i<n1;i++)
      L[i]=a[l+i];

    //   we can change the m and  r value 
for(int i=0;i<n2;i++)
    R[i]=a[++m];


int i=0,j=0;
int k=l;
while (i < n1 && j < n2) {
    if (L[i] <= R[j])
        a[k++] = L[i++];
    else
        a[k++] = R[j++];
  
}

while (i < n1) 
    a[k++] = L[i++];
while (j < n2)
    a[k++] = R[j++];
   

}  
}
