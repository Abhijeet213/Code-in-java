package Quee;

public class LinkedlistQuee {
    private static  Node front; 
    private Node rear; 
    private static  int size = 0;

    private class Node { 
        int value;       

        Node nextNode;   

        public Node(int value) {
            this.value = value;
        }

        public Node() { 
        }

    }
    public void remove() {
        if (isEmpty()) {
        System.err.println("Queue Is empty");
        return;
            
        } 
        front= front.nextNode;
        
    }
    public int peek() {
return front.value;
        
    }
    public void add(int val) {
        if (!isEmpty()){
        Node newnode = new Node(val);
        rear.nextNode = newnode;
        rear = newnode;
        size++;
        }
        else{
            Node newnode = new Node(val);
            front =rear = newnode;
        }
    }
    public boolean isEmpty(){
        if (front == null){
            return true;
        }
        else {return false;}

     }

    


}
