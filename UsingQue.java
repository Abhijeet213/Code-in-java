package Use;

import java.util.LinkedList;
import java.util.Queue;

import Quee.ArrQuee;
import Quee.LinkedlistQuee;

public class UsingQue {
    public static void main(String[] args) {
     Queue as = new LinkedList<>();
     as.add(90);
     as.peek();
        LinkedlistQuee a = new LinkedlistQuee();
    
        a.add(30);
       a.remove();
       a.remove();
       a.add(30);
while (!a.isEmpty()) {
System.out.println(a.peek());
a.remove();
    
}

    }
    
}
