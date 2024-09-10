import java.util.Stack;

public class LinkedList_palindrome {
        Node head;
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        void add(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
            }
            else{
                Node curr=head;
                while(curr.next!=null){
                    curr=curr.next;
                }
                curr.next=newNode;
            }
        }
        void print(Node head){
            Node curr=head;
            while (curr!=null){
                System.out.print(curr.data+"->");
                curr=curr.next;
            }
            System.out.println();

        }

        boolean ispalindrome(){
            Stack<Integer>s=new Stack<>();
            boolean flag=true;
            Node temp=head;
            while(temp!=null){
                s.push(temp.data);
                temp=temp.next;
            }
            temp=head;
            while(temp!=null){
                if(temp.data!=s.pop()){
                    flag=false;
                }
                temp=temp.next;
            }
            ;
            return flag;
        }


    public static void main(String[] args) {
        LinkedList_palindrome list=new LinkedList_palindrome();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(1);
        list.print(list.head);

        boolean ans= list.ispalindrome();
        System.out.println(ans);
        System.out.println(list.head.data);

    }
}
