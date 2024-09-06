import java.util.Stack;

public class Stack_insertAtBottom {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        int x=9;

        insertAtBottom(s,x);
    }

     static void insertAtBottom(Stack<Integer> s, int x) {
        Stack<Integer>t=new Stack<>();
         while (!s.empty()){

        int temp=s.peek();
        t.push(temp);
        s.pop();

         }

         s.push(x);
         while (!t.empty()){
             s.push(t.pop());
         }
         System.out.println(s);

    }
}
