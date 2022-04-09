import java.util.*;
public class ArrysCls {
    
public static void main(String args[]){

int []nums={1,23,14,5,6,7,8,10};

Arrays.sort(nums);

Arrays.fill(nums,23);

for(int x:nums)
System.out.print(x+" ");

int index=Arrays.binarySearch(nums,7);
System.out.println(index);


}


}
