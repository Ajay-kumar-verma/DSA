public class MtxTyp {
    
public static void main(String[] args) {
    int m1[][]={{1,2,3},{4},{4,5,6,7},{},{},{}}; 
    p(m1);          
  
    int m2[][]={{1,2,3}}; 
    p(m2);          

    int m3[][]={{1,2,3},{4}}; 
    p(m3);          

    int m4[][]={{1,2,3},{4,6,7}}; 
    p(m4);          


}

static void p(int a[][]){


   int row =a.length;
   // it return no of rows 
   int clom =a[0].length;
//    it return nosof colum in that rows 

  for(int x[]:a){ // it return rows 
      for(int y:x)
         System.out.print(y+" "); 
     System.out.println(); 
   }

System.out.println("Print matrix : "+row+":"+clom);
}
}
