public class StackImplementation {
    int top=-1;
    int size=5;
    int []arr=new int[size];
    void push(int ele){
        top++;
        arr[top]=ele;
    }
    void pop(){
        int del=arr[top];
        top--;
    }
    int peek(){
        return arr[top];
    }
    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        StackImplementation stack=new StackImplementation();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
