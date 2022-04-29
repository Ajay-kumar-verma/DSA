public class stk_pro{


public static void main(String [] args){

int a[]={3,4,5,78,6,3,2};

int profit=maxProfit(a);

System.out.println(profit);

}


public static int maxProfit(int[] prices) {
        
    int msf=Integer.MAX_VALUE;
    
    int mp=0;
    
    for(int x:prices){
        msf=(msf>x)?x:msf;
        
       mp=(mp<(x-msf))?(x-msf):mp; 
        
        
        
    }    
        
    return mp;
    
    
    
}


}