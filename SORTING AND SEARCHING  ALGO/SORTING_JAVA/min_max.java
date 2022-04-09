public class min_max {
    public static void main(String[] args) {
        
   int ar[]={5,6,3,1,90,-9,98};

    int min=ar[0];
    int max=ar[0];

    // for(int x:ar)
    // {
    //  min=(min>x)?x:min;
    //  max=max<x?x:max;
    // }
    
    for(int i=0;i<ar.length;i++)
    {int x=ar[i];
     min=(min>x)?x:min;
     max=max<x?x:max;
    }


   


      System.out.println("min is = "+min+"\nmax is = "+max);




    }

}
