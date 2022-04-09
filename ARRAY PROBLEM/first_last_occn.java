public class first_last_occn {
    
public static void main(String args[])
{

int a[]={1,2,3,3,4,5,6,7,8};
 
System.out.println(first_ocn(a,3));

}

static int first_ocn(int a[],int k){
  int i=0;
  int j=a.length-1;
//   System.out.println(j);
  int inx=0;
  while(i<=j){
   int mid=(i+j)/2;
    if(a[mid]==k){
       inx=mid;
        i=mid+1;   
     }
   else if(a[mid]>k)
      i=mid+1;
   else
     j=mid-1;
  }
    return inx;
}

static int last_ocn(int a[],int k){


    return 0;
}







}
