package com.google;

public class recursivefibo {
   static int total=0;        public static void main(String[] args) {
            System.out.println(0);
            System.out.println(1);
            fibonacci(0,1,5);
       
    }


    public static void fibonacci(int a,int b ,int n) { 
if (n == 0) {
return;    
}


total = a+b;
System.out.println(total);
a=b;
b=total;
n-=1;
fibonacci(a, b,n);



    }
}
