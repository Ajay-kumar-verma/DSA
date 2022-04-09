public class assing{
 
    public static void main(String[] args) {
       
        int i=2147483647;
        i++;
        System.out.println(i);//-2147483648

        byte x=127; x++;
        System.out.println(x); //-128
  
   System.out.println(Integer.toBinaryString(127));
   System.out.println(Integer.toBinaryString(-128));


    //    short p=2;
    //    short q=1;
    //    while(true){
    //        p++;q++;
    //        if(p<0){
    //         System.out.println("Max range can contain is "+q);return;
    //      }
    //    }

    }
}