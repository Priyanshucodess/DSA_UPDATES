import java.util.Stack;

public class Stack_permutations {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        int[]arr1={1,2,3};
        int[]arr2={3,1,2};

        boolean ans=permutationPossible(s,arr1,arr2);
        System.out.println(ans);
    }

    private static boolean permutationPossible(Stack<Integer> s, int[] arr1, int[] arr2) {

        int j=0;
        for (int i = 0; i < arr1.length ; i++) {
            s.push(arr1[i]);
            while(!s.isEmpty()&&s.peek()==arr2[j]){
                s.pop();
                j++;
            }
        }
        return s.isEmpty();
    }
}
