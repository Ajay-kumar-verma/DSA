public class movZero {

public static void main(String args[])
{

int a[]={1,0,0,2,0,5,0,0,3};

//   mZ1(a);
mZ2(a);

 for(int x:a)
  System.out.print(x);



}


static void mZ2(int nums[]){

  int i=0;

  for(int j=0;j<nums.length;j++){
   
    if(nums[j]!=0){
        int temp=nums[j];
          nums[j]=nums[i];
         nums[i]=temp;   
        i++;
    }



  }














    //  int i=0;
//  int j=1; 

//  while(i<j && j<a.length){

//       while(a[i]!=0)
//          i++;

//       while(a[j]==0)
//          j++;


//    if(i<j && j<a.length){
//      a[i]=a[i]+a[j];
//      a[j]=a[i]-a[j];
//      a[i]=a[i]-a[j];   
//      i++;j++;

//    }
//  }



}
// Function mz2

static void mZ1(int a[]){

    int i=0;
    int j=a.length-1;
    
    while(i<j){
        while(a[i]!=0)
           i++;
        
        while(a[j]==0)
           j--;
     
      if(i<j){
        a[i]=a[i]+a[j];
        a[j]=a[i]-a[j];  
        a[i]=a[i]-a[j];    
     
         i++;
         j--;
     
      }
    
}


}

}