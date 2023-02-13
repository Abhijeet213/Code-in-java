package stack;
import java.util.Stack;

public class revaStrusingstack {
   
    public static String reversStr(String str) {
        Stack<Character> as=new Stack<>();
        for (int index = 0; index < str.length() ; index++) {
            as.push(str.charAt(index));
        }
        str="";

        for (int index = 0;!as.empty() ; index++) {
          
            str+=as.peek();
            as.pop();
            
        }
        return str;

    }
    
}
