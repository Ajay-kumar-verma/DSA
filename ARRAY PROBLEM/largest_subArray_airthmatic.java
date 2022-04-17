public class largest_subArray_airthmatic {
    
public static void main(String[] args) {

//    int a[]={3,4,5,6,7,8,9,4,7,8,9,10,11};
int a[]={2,4,8,16,2,6,18};
   int n=a.length; 
   // n>=2;
System.out.print(maxSubA(a,n));


//    int pd=a[1]-a[0];
//    int count=2;
//    int max=2; 
    

//    for(int i=2;i<n;i++){
//         if(pd==a[i]-a[i-1]){
//             count++;
//         }
//        else {
//       count=2;
//           pd=a[i]-a[i-1];
//        } 

//    max=max<count?count:max;
//    }
// System.out.println(max);


}


static int maxSubA(int a[],int n){
    int max=2;
    long r=(long)a[1]/(long)a[0];
    int count=2;
   
    for(int i=2;i<n;i++){
       
        if(r==(long)a[i]/(long)a[i-1]){
            count++;
        }
       else{
        r=(long)a[i]/(long)a[i-1];
        count=2; 
       }
   max=max<count?count:max;

    }



    return max;
} 



}
