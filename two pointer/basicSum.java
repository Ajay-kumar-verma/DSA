public class basicSum {
    public static void main(String[] args) {
     int a[]={3,5,6,8,9,10,13,15,18};
     int len=a.length;
     System.out.println("max  sum is : "+a[len-1]+a[len-2]);
     System.out.println("min sum is : "+a[0]+a[1]);
     System.out.println("max diff : "+(a[len-1]-a[0]));
       
      int mind=a[len-1]-a[0];
      for(int i=0;i<len-1;i++){
          
        if(a[i+1]-a[i]<mind)
           mind=a[i+1]-a[i];  
       
    }

   System.out.println("Min diff : "+mind);


    }
}
