public class countPairSum {
// NOT COMPLETED 
    public static void main(String[] args) {
    
  int arr[] = {1, 5, 7, -1};
  cps(arr,6);

}    

static void cps(int a[],int sum){
 int i=0;int j=a.length;
  int cnt=0;
  while(i<=j){
    if(a[i]+a[j]==sum) {cnt++;}
    if(a[i]+a[j]>sum) j--;
    else i++;

}
 
  System.out.println(cnt);
}



}
