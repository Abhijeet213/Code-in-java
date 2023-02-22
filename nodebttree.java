package BT;


public class nodebttree {
    static class Node {
        int data;
        Node right;
Node left;
public Node (int value){
data = value;
}

        public Node() {

        }
    }
static Node root = new Node();
static int index=0;

       static Node roo = new Node();
       int Index =0;
    public  static  Node add(int arr[]){
if (arr[index] == -1){
    return root;
}
        roo.data = arr[index];
index++;
roo.left = new Node();
roo= roo.left;
        add(arr);
        roo.right = new Node();
        roo=roo.right;
        add(arr);

return  root;
    }

    public static void pre (Node root){
        // Root Left Right
        if (root == null) {
            return;
        }
        System.out.println(root.data);
pre(root.left);
pre(root.right);

    }

    public static void main(String[] args) {
    int[] a = {6,5,-1,-1,30};


       pre(add(a));
    }
}
