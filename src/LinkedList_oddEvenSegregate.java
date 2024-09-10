import java.util.ArrayList;

public class LinkedList_oddEvenSegregate {
        Node head;
    public class Node{
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
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    void segregate(){
        Node temp=head;
        ArrayList<Integer>arr=new ArrayList<>();
        while(temp!=null&&temp.next!=null){
            arr.add(temp.data);
            temp=temp.next.next;
        }
        Node temp1=head.next;
        while(temp1!=null&&temp1.next!=null){
            arr.add(temp1.data );
            temp1=temp1.next.next;
        }
           temp=head;
        for (int i = 0; i < arr.size() ; i++) {
            temp.data=arr.get(i);
            temp=temp.next;
        }

    }

    void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList_oddEvenSegregate list=new LinkedList_oddEvenSegregate();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.print();
        list.segregate();
        list.print();


    }
}
