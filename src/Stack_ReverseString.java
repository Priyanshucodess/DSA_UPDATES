import java.util.Stack;

public class Stack_ReverseString {
    public static void main(String[] args) {
        String s="priyanshu";
        Stack<Character> list= new Stack<Character>();
        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            list.push(ch);
        }
        while(!list.empty()){
            System.out.print(" "+list.peek());
            list.pop();
        }
    }
}
