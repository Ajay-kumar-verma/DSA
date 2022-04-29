import java.util.*;
public class subArray_zeroSum_ksum {
 public static void main(String[] args) {
        
  Set<Integer> s=new HashSet<Integer>();

int a[]={3,4,6,7,-13,76,5};
int k=13; 

// int sum=0;
// for(int i:a){
//  sum+=i;  
//  if(s.contains(sum-k))
//  {System.out.println("k  sub is there Found !");
//    break;
//  }
//  s.add(sum);
// }

int n=a.length; 
int sum=0;
int j=0;
for(int i=0;i<n;i++){
    sum+=a[i];
    int t=sum;
  while(t>k){
    t-=a[j++];
  }
  if(t==k){
      System.out.println(j+":"+i);
        break;
  }
  j=0;
}


// -------------------------------------------------

  // ZERO SUM 
  // 1 method using two for loop 
 //2 method storing into set and check if sum repeat 

// int sum=0;
// for(int i:a){
//  sum+=i;  
//  if(s.contains(sum))
//  {System.out.println("zero sub is there Found !");
//    break;
//  }
//  s.add(sum);
// }


//  int n=a.length;
//  boolean found=false;

// for(int i=0;i<n;i++){
//   int sum =a[i];
//       for(int j=i+1;j<n;j++){
//         sum+=a[j];
//         if(sum==0){found=true; break;}
         
//     }
//     if(found) break;
// }

// System.out.println(found);

// sunArray with given sum 


// int st=0;
//         int e=0;
        
//         int sum=0;
        
//          int k=0;
        
//          int i=0;
//         for(;i<n;i++){
//             sum+=arr[i];
         
//            while(sum>s){
//               sum=sum-arr[k++];  
//            }
//            if(sum==s){
//                st=k;
//                e=i;
//                 break;
//            }         
            
            
//         }
        
//         ArrayList<Integer> a=new ArrayList<Integer>();
        
//         if(i==n){
//             a.add(-1);
//         }
//         else{
//         a.add(st+1);
//         a.add(e+1);
//         }
//         return a;
        
        
//     }









    }
    

  





}
