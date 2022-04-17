public class max_min {
    public static void main(String[] args) {
        
  int a[]={5,4,2,7,8,1,34,76,90};
  int n=a.length;
  
  int max=Integer.MIN_VALUE;
  int min=Integer.MAX_VALUE;
  int ind_min=0;
  int ind_max=0;

  for(int i=0;i<n;i++){
     
  if(max<a[i]){
    max=a[i];
    ind_max=i;
  }
  
 if(min>a[i]){
    min=a[i];
    ind_min=i;
  }
  
  }


      
System.out.println(min+" "+ind_min);
System.out.println(max+" "+ind_max);


    }


}
