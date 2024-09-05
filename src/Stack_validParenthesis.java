import java.util.Stack;

public class Stack_validParenthesis {
    public static void main(String[] args) {
        String s="[({})]";
        boolean ans=isValid(s);
        if(ans){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    private static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for (char i : s.toCharArray()) {
            if(i=='['||i=='{'||i=='(') {
                stack.push(i);
            }
            else{
                if(stack.empty()){
                    return false;
                }
                char ch=stack.pop();
                if((i == ')' && ch == '(') ||  (i == ']' && ch == '[') || (i == '}' && ch == '{'))
                    continue;
                else
                    return false;


            }
        }

        return stack.empty();
    }
}
