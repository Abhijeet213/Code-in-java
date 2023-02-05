package Linkedlist;

// There is Linked List Heap
public class LL {
    private Node head; // Here are the First Node of linked list chain
    private Node tail; // Here are the Last Node of linked list chain
    private int size = 0; // Here are the Size of linked list chain

    private class Node { // Here Are The Structrure of Node 
        int value;       // Value of Single Node

        Node nextNode;   // Here Stores The next node Address

        public Node(int value) {// Here are A constructor for seting Value With initialization
            this.value = value;
        }

        public Node() { // Here are A null constructor 
        }

    }

    public void Print() {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.println(temp.value);

            temp = temp.nextNode;
        }

    }
 
public void helper (){
    Node Head = head;
    reversethelinkedlist(Head);
}
    public void reversethelinkedlist(Node Head) {
      
        if (Head ==null){
            return;
        }
       
        reversethelinkedlist(Head.nextNode);
        if (Head ==null){
            return;
        }
        System.out.println(Head.value);

    } 
    public void addLast(int val) {
        Node newnode = new Node(val);
        tail.nextNode = newnode;
        size++;
    }
int i =0;
    public void ADDFIRST(int val) {
        if (i ==1 ){
            tail=head;
            i++;
        }
        Node newnode = new Node(val);
        newnode.nextNode = head;
        
        head = newnode;
        size++;
i++;
    }

    public void add(int index, int element) {
        Node newnode = new Node(element);
        Node temp = head;
        for (int i = 1; i <= index - 1; i++) {
            if (temp.nextNode == null) {
                System.out.println("This Index Not Exists In LINKED LIST");
            } else {
                temp = temp.nextNode;
            }
        }
        Node temp1 = temp.nextNode;
        temp.nextNode = newnode;
        newnode.nextNode = temp1;

        size++;

    }
}
