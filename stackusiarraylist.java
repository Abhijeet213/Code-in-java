package stack;

import java.util.ArrayList;

public class stackusiarraylist {

   private static ArrayList<Integer> st = new ArrayList<Integer>();
   private static int size=-1;
    public  int size() {
    return size;
}
    public  void push(int val) {
        st.add(val);
        size ++;
    }
    public  void pop() {
        st.remove(size);
        size --;
    }
    public  int peek() {
       
        return st.get(size);
    }
    
}
