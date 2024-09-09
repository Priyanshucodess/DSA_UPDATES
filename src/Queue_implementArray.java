import java.util.Arrays;

public class Queue_implementArray {
    static class Queue{
        int front;
        int rear;
        int size=4;


        int[]arr=new int[size];
        boolean isEmpty(){
            return rear==-1;
        }

        void Enqueue(int x){
            if(rear==size){
                System.out.println("queue is full");
            }
            else{
                arr[rear]=x;
                rear++;
            }
        }

        int Dequeue(){
            if(!isEmpty()){
                int ans=arr[front];
                arr[front]=-1;
                front++;
                if(rear==front){
                    rear=0;
                    front=0;
                }
                return ans;

            }
            else{
                return -1;
            }
        }

        int Queuefront(){
            if(rear==-1){
                return -1;
            }
            else{
                return arr[front];
            }
        }





    }
    public static void main(String[] args) {
            Queue queue=new Queue();
            queue.Enqueue(1);
            queue.Enqueue(2);
            queue.Enqueue(3);
            queue.Dequeue();
            int ans= queue.Dequeue();



            System.out.println(queue.isEmpty());
            System.out.println(Arrays.toString(queue.arr));
            System.out.println(ans);
            System.out.println(queue.Queuefront());


    }
}
