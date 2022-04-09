public class swaping {
    
public static void main(String[] args) {
    
int a=5;
int b=8;

// 1 way
 int temp=a;
 a=b;
 b=temp;

//  2 ways 
 a=a^b;
 b=a^b;
 a=a^b;

// 3 ways

a=a+b;
b=a-b;
a=a-b;

// 4 ways
a=a*b;
b=a/b;
a=a/b;


System.out.println("a = "+a+"\nb = "+b);

}


}
