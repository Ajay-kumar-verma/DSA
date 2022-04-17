public class firstbitAtright{

public static void main(String[] args) {

    int a=8;
    int n=a&~(a-1);
System.out.println(n);

// n=a&-a;
// System.out.println(n);
System.out.println(Integer.toBinaryString(3));
System.out.println(Integer.toBinaryString(-3));
System.out.println(Integer.bitCount(-3));

}


}