public class LinkedList_sort {
    Node head;
    int size=0;
    public class Node{
        int data;
        Node next;
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
            return;
        }
        else{
            Node temp=head;
            while (temp.next!=null){
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

    void sort(){
        Node current=head;
        while (current!=null){
        Node Next=current.next;
          while (Next!=null){
              if(current.data>Next.data){
                  int temp=current.data;
                  current.data= Next.data;
                  Next.data=temp;
              }
              Next=Next.next;
          }
          current=current.next;

        }





    }

    public static void main(String[] args) {
        LinkedList_sort list=new LinkedList_sort();
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(4);

        list.print();
        list.sort();
        System.out.println();
        list.print();
    }
}
