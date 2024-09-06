import java.util.Stack;

public class Stack_removeMidElementRecursion {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        int size=s.size();
        int count=0;
        solve(s,size,count);
        System.out.println(s);
    }

     static void solve(Stack<Integer> s, int size, int count) {
//        count=0

        if(count==size/2){
            s.pop();
            return;
        }
//        num=5
        int num=s.peek();
//        5 is popped
        s.pop();
//        similar process until count==size
        solve(s,size,count+1);
//      put those value back if they are not middle elementrough
        s.push(num);
    }
}
