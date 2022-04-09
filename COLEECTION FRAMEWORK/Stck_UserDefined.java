import java.util.*;

public class Stck_UserDefined{
public static void main(String[] args) {

Stack<node> s=new Stack<node>();
s.add(new node(5));
s.add(new node(25));
s.add(new node(45));
s.add(new node(65));

System.out.println(s.pop().x);



}

}



class node{
int x;
node(int x){
    this.x=x;
}


}
