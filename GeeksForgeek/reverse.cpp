#include <iostream>
using namespace std;

int main() {
    cout<<"Enter test cases : ";
    int t=0;
    cin>>t;
//   cin put curser down 
 
   while(t--){
     
     cout<<"EnterArray size : ";
   int n;
   cin>>n;
   int a[n];    
   
  for(int i=0;i<n;i++)
  {cout<<(i+1)+" ele : ";
    cin>>a[i];
  }
      
      
      
     cout<<"Enter rever array"; 
for(int j=n-1;j>=0;j--)
  cout<<a[j]<<" ";
      
      
    cout<<endl;  
      
  } 



	return 0;
}
