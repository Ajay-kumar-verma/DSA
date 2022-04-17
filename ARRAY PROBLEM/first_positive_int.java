import java.util.*;
public class first_positive_int {
   
public static void main(String[] args) {

    int a[]={6,7,4,3,-9,4,1,2};
   int n=a.length;
     HashSet<Integer> s=new HashSet<Integer>();
    for(int i:a)
        s.add(i);


  for(int i=1;i<n;i++){
    if(!s.contains(i))
      System.out.println(i);
  }    



}

}
