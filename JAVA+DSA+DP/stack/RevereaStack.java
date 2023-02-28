package stack;

import java.util.Stack;

public class RevereaStack {
    public static void reverse (Stack<Integer> as) {
        if (as.empty()) {
            return;            
        }
        int top = as.pop();
        reverse(as);
   insertatbottom.inatbot(top,as);
        
    }
    
}
