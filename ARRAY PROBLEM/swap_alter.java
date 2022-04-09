public class swap_alter {
 public static void main(String args[]){

int a[]={4,6,2,3,78,1,6,7};



for(int i=0;i<a.length-1;i+=2){
   int temp=a[i]^a[i+1];
    a[i]=temp^a[i];
    a[i+1]=temp^a[i+1];

}


for(int x:a)
 System.out.print(x+" ");

}

}
