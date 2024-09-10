 class LinkedList_implementation {
        private int size;
        Node head;
        LinkedList_implementation(){
            size=0;
        }
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }


    }

        void addFirst(int data){
            Node newNode=new Node(data);
            newNode.next=head;
            head=newNode;
        }

        void addLast(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            Node currentNode=head;
            while(currentNode.next!=null){
                   currentNode=currentNode.next;
            }
                   currentNode.next=newNode;

        }

        void deleteFirst(){
            if(head==null){
                System.out.println("empty");
                return;
            }
            head=head.next;
            size--;
        }

        void deleteLast(){
            if(head==null){
                System.out.println("empty");
                return;
            }
            size--;
            Node currentNode=head;
            Node lastNode=head.next;
            while (lastNode.next!=null){
                lastNode=lastNode.next;
                currentNode=currentNode.next;
            }
            currentNode.next=null;

        }

        void middleElement(int index , int data){
            Node newNode=new Node(data);
            Node currentNode=head;

            for (int i = 1; i <size ; i++) {
                if(i==index){
                    Node Next=currentNode.next;
                    currentNode.next=newNode;
                    newNode.next=Next;

                    break;
                }
                currentNode=currentNode.next;
            }
        }


        void print(){
            Node currentNode=head;
            while (currentNode!=null){
                System.out.print(currentNode.data+"->");
                currentNode=currentNode.next;
            }
        }

        void size(){
            System.out.println();
            System.out.println(size);
        }



    public static void main(String[] args) {
        LinkedList_implementation list=new LinkedList_implementation();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addLast(4);
        list.deleteFirst();
        list.deleteLast();
        list.print();
        list.size();


    }
}
