import java.util.*;
public class permutaion_str {
    
public static void main(String[] args) {

while(true){

// ArrayList<String> a=new ArrayList<String>();
// Scanner sc= new Scanner(System.in);
// System.out.print("Enter string : ");
// String str=sc.next();
// allStr(str,0,a);
// System.out.println("OUTPUT ARE : \n"+a.toString());


ArrayList<Integer> a=new ArrayList<Integer>();
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();

for(int i=0;i<n;i++){
   a.add(sc.nextInt());
  }
  

    ArrayList<ArrayList<Integer>> lst=new ArrayList<ArrayList<Integer>>();
System.out.println(a.toString());
 AllNums(a,0,lst);
 System.out.println(lst.toString());

}

}


static void allStr(String str,int index, ArrayList<String> ar){

  if(index==str.length()-1){
     ar.add(str);
    return;
     }
 
for(int i=index;i<str.length();i++){

 char s[]=str.toCharArray();
 char c=s[index];
 s[index]=s[i];
 s[i]=c;
 
  allStr(new String(s),index+1,ar); 
}






}


static void AllNums(ArrayList<Integer> a,int index, ArrayList<ArrayList<Integer>> lst){

  ArrayList<Integer> pm=new ArrayList<Integer>();

 if(a.size()-1==index){
    lst.add(a);  
 }

 for(int i=index;i<a.size();i++){

   int temp=a.get(index);
   a.set(index,a.get(i));
   a.set(i,temp);
    AllNums(a,index+1,lst);

 }




}



}
