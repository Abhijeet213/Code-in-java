package stack;

 public class stackusiLL {
    private class Node { // Here Are The Structrure of Node 
        int value;       // Value of Single Node
    
        Node nextNode;   // Here Stores The next node Address
    
        public Node(int value) {// Here are A constructor for seting Value With initialization
            this.value = value;
        }
    
        public Node() { // Here are A null constructor 
        }
    
    }
    static Node head;
    static int size=0;
   
   public static int size() {
        return size;
    }
public  void push(int val) {

   
     Node newnode = new Node(val);
    newnode.nextNode = head;
    
    head = newnode;
   
    size++;


   }
   public void pop() {
    head = head.nextNode;
   }

   public int peek() {
return head.value;
   }

}
