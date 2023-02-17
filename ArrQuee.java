package Quee;



public class ArrQuee {
    int[] a ;
   int front=-1;
   
    int size;
   
   public ArrQuee (int siz) {
        size=siz;
        a = new int[size];
        

    }
    
    public  void add(int val) {
       if (!IsFull()){
        front++;
        a[front]=val;
        
       }
       
    }
    public  int peek() {
      return a[0];
        
     }
     public boolean isEmpty(){
        if (front == -1){
            return true;
        }
        else {return false;}

     }
    public  boolean IsFull() {
        if (front ==  size){
            return true;

        }
        else {
            return false;
        }
        
    }
    public  void remove() {
       for (int i = 1; i <= front; i++) {
        a[i-1]=a[i];
       }
       front --;
        
    }
    public static void main(String[] args) {
        
    }
}
