import java.util.Stack;

public class Stack_removeMiddleElement {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        removeMid(s);
        System.out.println(s);
    }

    private static void removeMid(Stack<Integer> s) {
        Stack<Integer>temp=new Stack<>();
        int mid=s.size()/2;
        for (int i = 0; i <mid ; i++) {
            temp.push(s.pop());
        }
        s.pop();
        for (int i = 0; i <mid ; i++) {
            s.push(temp.pop());
        }
    }
}
