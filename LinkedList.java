class Node {
    int data;
    Node next;

    Node(int data) {
        this.data=data;
        this.next=null;
    }
}


public class LinkedList
{
    Node head=null;
    LinkedList() {
        head=null;
    }

    void insertBegining(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

     void insertLast(int data) {
        Node newNode=new Node(data);
        if(head==null) {
            head=newNode;
            return;
        }

        Node current=head;
        while(current.next!=null) {
            current=current.next;
        }
        current.next=newNode;
    }

    void insertMiddle(int index,int data){
        Node current=head;
        for(int i=0;i<index-1;i++){
            current=current.next;
        }
        Node newNode=new Node(data);
        newNode.next=current.next;
        current.next=newNode;
    }

     void display() {
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
        System.out.print("null");
    }


    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertBegining(5);
        list.insertMiddle(4,35);

        list.display();

    }
}