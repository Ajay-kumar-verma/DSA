public class max_min_sum_sor_far {
    
public static void main(String[] args) {
    int a[]={4,6,5,1,2,-7,-5,4,2,12};

    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    int sum=0;
     for(int i:a){
     sum+=i;
      max=max<i?i:max; 
      min=min>i?i:min;
    System.out.println("Min "+min+": MAx "+max+": sum"+sum);   

        }


// if sum so far repeat means zero subArray_zeroSum present 

}

}
