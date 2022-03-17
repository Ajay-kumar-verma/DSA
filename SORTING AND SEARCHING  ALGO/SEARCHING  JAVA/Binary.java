public class Binary {

public static void main(String[] args) {

    
   int ar[]={1,2,4,5,6,7,8,12,34,56,90};
   int key =1;
   

   System.out.println(BSearch(ar,0,11,key)); 


}


// static int BSearch(int a[],int key){
//  int low=0;
//  int high=a.length-1;
  
//   while(low<=high){

//        int mid=low +(high-low)/2;
//           if(a[mid]==key)
//             return mid;
//           if(a[mid]>key)
//             high=mid-1;    
//           else 
//            low =mid+1;

//   }

//    return -1;
// }



static int BSearch(int a[],int low ,int high,int key){
   
      if(low>high) return -1;
     
      int mid=low +(high-low)/2;
      if(a[mid]==key)
       return mid;
      if(a[mid]>key)
       return   BSearch(a,low,mid-1,key);     
      else 
       return   BSearch(a,mid+1,high,key);

    }
   






}
