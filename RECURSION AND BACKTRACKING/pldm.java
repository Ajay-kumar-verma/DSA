public class pldm{

public static void main(String[] args) {
     System.out.println(cp("racecar",0,6));
}

static boolean cp(String s,int i,int j){
    if(i>=j) return true;
    if(s.charAt(i)!=s.charAt(j)) return false;
  return cp(s,++i,--j);
}

}