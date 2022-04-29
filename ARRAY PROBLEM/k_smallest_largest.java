public class k_smallest_largest { 
public static void main(String[] args) {
int a[]={2,-4,-10,9,28,4,5};
int n=a.length;

// int loc= pivotloc(a,0,n);
// System.out.println(loc);

System.out.println(kthMin(a,0,n-1,5));
sort(a,0,n-1);
 p(a);
}

static void sort(int a[],int low ,int high){
   if(low<high){
      // p(a);
      int p=pivotloc(a,low,high);
      // System.out.println(p);
      //   p(a);
          sort(a,low,p-1);
       sort(a,p+1,high); 
   }

}

static int kthMin(int a[],int low,int high,int k){
           if(low==high) return a[low];  
    int loc= pivotloc(a,low,high);
        if(k==loc) return a[k];
      if(loc>k)
        return kthMin(a,low,loc-1,k);
      else 
        return kthMin(a,loc+1,high,k); 

}




static int pivotloc(int a[],int low, int high){
// concept od shifting 
 int p=a[high-1];
 int k=low;

for(int i=low;i<=high;i++){
    if(a[i]<p)
      {  
       int t=a[k];
       a[k]=a[i];
       a[i]=t; 
       k++; 
    } 
   
 }

 int t= a[k];
 a[k]=p;
 a[high-1]=t;

// here p is in corect position
// here we maintaing orderof lesser ele 
return k;

// // we can use two point concept also here 
// // we can use space also here 



// ---------------------------------------------------

// in 1 method p ele get put at correct position
// in below method ele at  i=j will be correct   

//-----------------------------------------------------






// // System.out.println("hello");
// int p=a[high-1];
// int i=low;
// int j=high-1;
// System.out.println(i+":"+j);

// while(i<j){
//     // System.out.println(i+":"+j);

//      while(p>a[i])
//          i++;

//     while(p<a[j])
//        j--;     

//     //    System.out.println(i+":"+j);

//     if(i<j){
//    int t=a[i];
//    a[i]=a[j];
//    a[j]=t; 
//    i++;
//    j--;
// }  
// // System.out.println(i+":"+j);

// }

// // System.out.println(i+":"+j);
// // System.out.println(i+":"+j);
// return i;

}

static void p(int a[])
{
for(int i:a)
System.out.print(i+" ");
System.out.println();
}

}
