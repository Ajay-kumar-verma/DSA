import java.util.*;

public class TrSt{
public static void main(String[] args) {

    TreeSet<Integer> ts=new TreeSet<Integer>();

    ts.add(45);
    ts.add(5);
    ts.add(445);

    System.out.println(ts.add(45));// true for insertion 
    System.out.println(ts.add(475));// false for not insertion 
    

    System.out.println(ts.size());

Iterator<Integer> i=ts.iterator();


// ele oare aceesc in accedinging order 
while(i.hasNext())
 System.out.println(i.next());



}

}

