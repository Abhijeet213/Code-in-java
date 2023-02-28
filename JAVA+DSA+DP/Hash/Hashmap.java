package Hash;

import java.util.LinkedList;

public  class Hashmap<K,V>{
    LinkedList<Node> nod[]= new LinkedList[6];
   class Node {
       K key;
       V value;
       Node (K key, V value) {
           this.key = key;
           this.value = value;

       }
   }

   Hashmap(){
       for (int i = 0; i < nod.length; i++) {
           nod[i] = new LinkedList<>();
       }
   }
   public void print(){

       for (int i = 0; i < nod.length; i++) {
           for (int j = 0; j < nod[i].size(); j++) {
               System.out.println("Key ="+nod[i].get(j).key +"\n" +"Value ="+nod[i].get(j).value);
           }
       }



   }
   private int searchinLL(int hash , K key){
LinkedList<Node> all = nod[hash];
int i=0;
if(all ==null){
    return -1;
}
for(Node node : all){
    if (node.key == key) {
        return i;
    }
    i++;
}
return -1;
   }
    public   void put(K key, V value) {
       int hash =key.hashCode()%10;
       int i =searchinLL(hash, key);
       if (i == -1){
           Node node = new Node(key, value);
           nod[hash].add(node);
       }
       else {
           nod[hash].get(i).value=value;
       }

    }



    public static void main(String[] args) {
     Hashmap a = new Hashmap();
     a.put(30,"Rohan");
        a.put(30,"Rohan");
        a.put(30,"Rohan");
        a.put(70,"sohan");
        a.put(70,"Ajmer");
        a.print();
    }
}
