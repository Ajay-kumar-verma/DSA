public class ele_with_high_frcy {
public static void main(String[] args) {
    
int a[]={3,4,12,5,6,4,4,4,6,6,6,6,2};
int n=a.length;

int val=a[0];
int count=1;

for(int i=1;i<n;i++)
{      
     if(val==a[i]) count++;
     else count--;

     if(count==0){
         val=a[i];
         count=1;
     }
}

  int f=0;
for(int i:a){
    if(i==val)f++;
 }

System.out.println("Value "+val);
System.out.println("Frequency "+f);
System.out.println("size of array "+n);
}

}
