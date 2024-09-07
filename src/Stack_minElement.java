import java.util.Stack;

public class Stack_minElement {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(3);
        s.push(1);
        s.push(8);
        s.push(12);

        int min=Integer.MAX_VALUE;
        while(!s.isEmpty()){
            if(s.peek()<min){
                min=s.peek();
            }
            s.pop();
        }
        System.out.println(min);
    }
}
