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
       else 
       System.out.println("Array Is Full Exception");
       
    }
    public  int peek() {
      return a[0];
        
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
