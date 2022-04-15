public class pos1 {
    
    public static void main(String[] args) {
        System.out.println(findPosition(8));
    }

    static int findPosition(int N) {
        // code here
    if(N==0) return -1;
    int c=0;
    
    while(N>0)
     { 
         if(N%2==1){
           c++;
           N=N>>1;
         } 
        else{
            N=N>>1;c++;
         continue;
        } 
      if(N==0) return c;
       else return -1;
     }
           
    return c;    
        
    }
}
