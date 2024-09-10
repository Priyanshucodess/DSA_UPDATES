public class LinkedList_middleElement {
 Node head;
 int size=0;
     class Node{
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
             Node current=head;
             while(current.next!=null){
                 current=current.next;
             }
             current.next=newNode;
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
     void middleElement(){
         int mid=(size/2);
         Node temp=head;
         for (int i = 0; i <mid ; i++) {
             temp=temp.next;
         }
         int ans=temp.data;
         System.out.println(ans);
     }
    public static void main(String[] args) {
           LinkedList_middleElement list=new LinkedList_middleElement();
           list.add(1);
           list.add(2);
           list.add(3);
           list.add(4);

           list.print();
           list.middleElement();

    }
}
