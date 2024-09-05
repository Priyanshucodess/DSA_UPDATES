import java.util.Stack;

public class Stack_reverseUsingStack {
    public static Stack<Integer> reverse(Stack<Integer> s) {
        Stack<Integer> temp = new Stack<>();
        while (!s.empty()) {
            temp.push(s.pop());
        }
        return temp;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);
        Stack<Integer>ans=reverse(s);
        System.out.println(ans);
    }
}
