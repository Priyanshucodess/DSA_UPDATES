import java.util.Stack;

public class Stack_InsertionAtBottomRecursion {
    public static void solve(Stack<Integer>s,int x){
        if(s.isEmpty()){
            s.push(x);
            return;
        }
        int num=s.peek();
        s.pop();
        solve(s,x);

        s.push(num);
    }
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        int x=5;
        solve(s,x);
        System.out.println(s);
    }
}
