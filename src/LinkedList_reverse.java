import java.util.*;

public class LinkedList_reverse {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;

        }
        else{
           Node temp=head;
           while(temp.next!=null){
               temp=temp.next;
           }
           temp.next=newNode;

        }

        }

    void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    void reverse(){
        Stack<Integer>s=new Stack<>();
        Node temp=head;
        while(temp!=null){
            s.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while (temp!=null){
            temp.data=s.pop();
            temp=temp.next;
        }

    }
    public static void main(String[] args) {
        LinkedList_reverse list=new LinkedList_reverse();
        list.add(1);
        list.add(2);
        list.add(3);
        list.reverse();
        list.print();





    }
}
