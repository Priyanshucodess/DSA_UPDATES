public class LinkedList_sort012 {
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
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }

    void sort_012(){
        Node temp=head;
        while(temp!=null){
            Node temp1=temp.next;
            while(temp1!=null){
                if(temp.data>temp1.data){
                    int t= temp.data;
                    temp.data= temp1.data;
                    temp1.data=t;

                }
                    temp1=temp1.next;
            }
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList_sort012 list=new LinkedList_sort012();
        list.add(1);
        list.add(0);
        list.add(2);
        list.add(2);
        list.print();
        list.sort_012();
        list.print();



    }
}
