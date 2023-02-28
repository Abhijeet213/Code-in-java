package stack;

import java.util.Stack;

public class insertatbottom {
    public static void inatbot(int val,Stack<Integer> as)  {
if (as.empty()){
    as.push(val);
    return;
}
int top =as.pop();
    inatbot(val,as);
   as.push(top);
        
    }
    public static void main(String[] args) {
        
    }
    
}
