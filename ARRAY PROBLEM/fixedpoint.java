public class fixedpoint {
    
public static void main(String[] args) {
    int a[]={-10,-3,0,3,7,19};

    System.out.println(fp(a));

}

static int fp(int a[]){
int s=0;
int e=a.length-1;

while(s<=e){
  int m=s+(e-s)/2;
  if(a[m]==m)
    return m;
  if(a[m]>m)
    e=m-1;
    else 
    s=m+1;

}

    return -1;
}



}
