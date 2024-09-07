import java.util.Stack;

public class Stack_redundantBracket {
    public static void main(String[] args) {
        String s = "((a+b))";
        boolean ans = check(s);
        System.out.println(ans);  // Should return false (no redundant brackets)
    }

    private static boolean check(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Push opening brackets and operators onto the stack
            if (ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                stack.push(ch);
            }
            // When encountering a closing bracket
            else if (ch == ')') {
                boolean isRedundant = true;

                // Check the top of the stack for operators inside the brackets
                while ( stack.peek() != '(') {
                    char top = stack.pop();

                    // If an operator is found, the brackets are not redundant
                    if (top == '+' || top == '-' || top == '*' || top == '/') {
                        isRedundant = false;
                    }
                }



                // If no operator was found between brackets, return true (redundant)
                if (isRedundant) {
                    return true;
                }
            }
        }

        // If no redundant brackets are found, return false
        return false;
    }
}
