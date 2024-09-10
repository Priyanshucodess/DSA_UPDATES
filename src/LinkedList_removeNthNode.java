public class LinkedList_removeNthNode {
    Node head;
    int size=0;
    class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
            size++;
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
        Node current=head;
        while (current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println();
    }

    void delete(int index){
        int i=size-index;
        Node current=head;
        for (int j = 1; j <i ; j++) {
            current=current.next;
        }
        Node deleteNode=current.next;
        current.next=current.next.next;
    }

    public static void main(String[] args) {
        LinkedList_removeNthNode list=new LinkedList_removeNthNode();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.print();
        System.out.println(list.size);
        list.delete(2);
        list.print();
    }
}
