package Linkedlist;

public class LL {
    private   Node head; 
    private   Node tail;
    private   int size =0; 

private  class Node {
    int value;
   Node nextNode;
    public Node(int value) {
        this.value = value;
    }
    public Node() {
    }
    
}

public  void Print() {
    Node temp=head;
    for (int i = 0; i < size; i++) {
        System.out.println(temp.value);
        
        temp= temp.nextNode;
    }
    
}
public  void addLast(int val) {
Node newnode = new Node(val);
tail.nextNode=newnode;
size++;
}
public  void ADDFIRST(int val) {
    Node newnode = new Node(val);
     newnode.nextNode=head;
    head=newnode;
size++;

    }
    public  void add(int index, int element){
        Node newnode = new Node(element);
        Node temp =head;
        for (int i = 1; i <= index-1; i++) {
            if (temp.nextNode ==null){
            System.out.println("This Index Not Exists In LINKED LIST");
            }
            else{
                temp=temp.nextNode;
            }
        }
        Node temp1 = temp.nextNode;
        temp.nextNode=newnode;
        newnode.nextNode= temp1;

        size++;

    }
}
