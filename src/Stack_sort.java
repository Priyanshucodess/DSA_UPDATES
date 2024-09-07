import java.util.Stack;

public class Stack_sort {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(5);
        s.push(8);
        s.push(1);
        s.push(3);
        System.out.println(s);
        SortStack(s);
        System.out.println(s);


    }

    private static void SortStack(Stack<Integer> s) {
//        base condition
        if(s.isEmpty()){
            return;
        }
//        recursion func
        int num=s.peek();
        s.pop();
        SortStack(s);
//        insertion func
        insertion(s,num);
    }

    private static void insertion(Stack<Integer> s, int num) {
             if(s.isEmpty() ||(!s.isEmpty()&&s.peek()<num)){
                 s.push(num);
                 return;
        }
             int n=s.peek();
             s.pop();
             insertion(s,num);
             s.push(n);

    }
}

