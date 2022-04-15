public class revrseAry {
    
    public static void main(String[] args) {
        String str="Ajay345";
    
        System.out.println(r(str)); 

    }

// we can use Stack here 
// we swap left with right if accessing posible 
// we can create new array ,string, linked list and add from last    
//  we can use recursion to get last node or backtracking from last 


//  it can reverse String as well as Array
static String r(String s){
  if(s.equals("")) return "";
  char ca[]=s.toCharArray();
  int i=0;
 int j=ca.length-1;

 while(i<j){
  char c=ca[i];
 ca[i]=ca[j];
 ca[j]=c;
i++;
j--; 
} 

 return  new String(ca);

}


}
