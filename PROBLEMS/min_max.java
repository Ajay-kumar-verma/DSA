public class min_max {
// it is bases on min and max so far 
 public static void main(String[] args) {
   
    int a[]={3,5,6,3,8,9,112,8};
int min=Integer.MAX_VALUE;
int max=Integer.MIN_VALUE;

int d=0;
for(int x:a){
 min=min>x?x:min;
 max=max<x?x:max;

 d=max-min;
}


System.out.println(d);

 }   



}
