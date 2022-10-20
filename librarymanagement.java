
package com.google;

import java.util.Scanner;

public class librarymanagement {
    
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
    System.out.println("Hi Welcome To The Library");
    System.out.println();

    System.out.println("1-To Issue Book  2-To Return Book  3-To Add Book  4-To Check Book Its Available Or Not");
      
    int  i = scan.nextInt();
    

    switch (i) {
        case 1:
            
            IssueBook();
            break;
    case 2: 

    ReturnBook();
    break;
case 3:
AddBook();
break;
case 4:
Check();
break;
        
            
    }

 

    
}

public static void IssueBook() {
    System.out.println("Loding");
    System.out.println();
    System.out.println("Welcome To Issue Book Management");
}
public static void ReturnBook() {
    
}
public static void AddBook() {
    
}
public static void Check() {
    
}

}
