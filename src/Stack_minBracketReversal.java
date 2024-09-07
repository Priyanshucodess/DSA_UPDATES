import java.util.Stack;

public class Stack_minBracketReversal {
    public static int minBracketRev(String s, Stack<Character>stack){
        if(s.length()%2==1)
            return -1;

        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            if(ch=='('){
                stack.push(ch);
            }
            else {
                if(stack.peek()=='('){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }
        }
            int a=0;
            int b=0;
        while (!stack.isEmpty()){
            if(stack.peek()=='(')
                a++;

            if(stack.peek()==')')
                b++;

           stack.pop();
        }
           int ans=(a+1)/2+(b+1)/2;
           return ans;

    }
    public static void main(String[] args) {
        Stack<Character>stack=new Stack<>();
        String s="(()(((";
        int ans=minBracketRev(s,stack);
        System.out.println(ans);
    }
}
