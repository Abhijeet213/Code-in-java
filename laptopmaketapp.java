package com.google;

import java.util.Scanner;

public class laptopmaketapp {
   static boolean ka =false;
    static int y = 4;
    static int z = 4;
    
    static int password = 678920;
    static String[][] cs = new String[10000][7];
    static String[][] user = new String[1000][2];
    int users = 5;

    public static void main(String[] args) {

        user[0][0] = "Abhijeet12Bissa";
        user[0][1] = "As@12";

        user[1][0] = "22Dris33htiBissa";
        user[1][1] = "ba@12";

        

        user[2][0] = " Brijesh737Bissa";
        user[2][1] = "As@12";

        user[3][0] = "Anshu90Bissa";
        user[3][1] = "nh@12";

        user[4][0] = " Saroj89Bissa";
        user[4][1] = "Sb@12";

        cs[0][0] = "HP PRESARIO CQ43";
        cs[0][1] = "2GB DDR3";
        cs[0][2] = "21000";
        cs[0][3] = "250 GB Hardisk ";
        cs[0][4] = "Intel Pentium B950 2.10 GHz";
        cs[0][5] = "Windows 7 Home";
        cs[0][6] = "No Graphis Card";

        cs[1][0] = "Lenovo IdeaPad Gaming 3";
        cs[1][1] = "4GB DDR6  ";
        cs[1][2] = "56,990";
        cs[1][3] = "1 TB Hardisk ";
        cs[1][4] = " Intel Core i5 10th Gen ";
        cs[1][5] = "Windows 10 Home";
        cs[1][6] = "NVIDIA GTX 1650";

        cs[2][0] = "HP Chromebook";
        cs[2][1] = "4GB";
        cs[2][2] = "56,990";
        cs[2][3] = "64 Gb eMMC ";
        cs[2][4] = "Chorme Book";
        cs[2][5] = "Chorme Os";
        cs[2][6] = " No Graphis Card ";

        cs[3][0] = "Dell Inspiron 3505";
        cs[3][1] = "8GB DDR4";
        cs[3][2] = "38,690";
        cs[3][3] = "256GB SSD ";
        cs[3][4] = "AMD Ryzen 3 3250U Mobile Processor";
        cs[3][5] = "Win 10 + MS Office";
        cs[3][6] = "Radeon Graphics";

        cs[4][0] = "Apple MacBook Air";
        cs[4][1] = "8GB RAM";
        cs[4][2] = "88,990";
        cs[4][3] = "256GB SSD ";
        cs[4][4] = "Apple M1 chip";
        cs[4][5] = "MacOS 10.14 Mojave";
        cs[4][6] = " GPU";

        Welcome();

    }

    public static void Welcome() {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Welcome to  MaTechno Market ");

        System.out.println( "  1 to Add Laptop pc etc ...  in Market - YOU Must Make or Enter id  2 to Buy Laptop pc etc ...  ");
        int bad = Scan.nextInt();

        if (bad == 1) {
            add();
        } else {
            Buy();
        }

    }

    public static void add() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1 to  Enter Password 2 to Forgot Password  ");
        int ef = scan.nextInt();
        if (ef == 1) {
            addproduct();
          
        }else{
if(ef == 2){
    for (int  nb = 0; nb < 0; nb++) {

      
        
    
           System.out.println("Enter Enter Uniqe Id name1 ");
                  String username1 = scan.nextLine();
                  for (int i = 0; i < user.length; i++) {
                      if (user[i][1] == username1) {
                          System.out.println("Your Login Id");
                         
                          System.out.println(user[i][1]);


                      }

                          
                      }
                      
      }  forgotpassword();    }
        }
    }

    public static void Buy() {
        Scanner scan = new Scanner(System.in);
    System.out.println("1 to Serch Product 2 to List of Pc , Laptop etc ...... ");
     int ls  = scan.nextInt();
     if(ls == 2){

        for (int i = 0; i < cs.length; i++) {
          
       if (cs[i][0] == null) {
           ka = true ;
       }  
       else{System.out.println((cs[i][0]));ka = true ;}       
       if (cs[i][2] == null) {
        ka = true ;
    }  
      
       else{System.out.println((cs[i][2]));ka = true ;}
     
            
            
            
        }
        if (ka == true) {
            Welcome();
            
        }

     }else{
         System.out.println(" Enter name of Product");
         
         String proname1 =scan.nextLine();
         String proname11 =scan.nextLine();
        for (int i = 0; i < cs.length; i++) {
          
            if (cs[i][0].equals(proname11)) {
                System.out.println(proname11);
                System.out.println(" Yes This Product is available ");
                System.out.println(" 1 to Buy product 2 to  exit Returns Home ");
                int buyexit = scan.nextInt();
                if(buyexit == 1){
                    System.out.println(" Enter Your name ");
                        String name = scan.nextLine();
                        String name1 = scan.nextLine();
                        System.out.println(" Enter Phone Number  ");
                       String phone =  scan.nextLine();

                        System.out.println("Payment Method  ");
                        String Paymentmethod =  scan.nextLine();

                        System.out.println("Your Odered " + proname11);
                        System.out.println(" Your Oder  recived in twotothreedays ");
Welcome();
      System.out.println();
                }
            }  
            

     }
    System.out.println("This Proudct Not Avaivable ");
Welcome();}
    }
  
    public static void addproduct() {
        Scanner scan = new Scanner(System.in);
         
        System.out.println("enter name1 of product ");
        String name1 = scan.nextLine();

        System.out.println("enter Price of product ");
        String pri = scan.nextLine();

        System.out.println("enter Ram of product ");
        String ram = scan.nextLine();

        System.out.println("enter value of sotrage And type of Storge of product ");
        String Stro = scan.nextLine();

        System.out.println("enter Prosser of product ");
        String pro = scan.nextLine();

        System.out.println("enter Graphis Card of product ");
        String gra = scan.nextLine();

        System.out.println("enter OS of product ");
        String os = scan.nextLine();
        
     
        cs[y + 1][0] = name1;
        cs[y + 1][1] = ram;
        cs[y + 1][2] = pri;
        cs[y + 1][3] = Stro;
        cs[y + 1][4] = pro;
        cs[y + 1][5] = os;
        cs[y + 1][6] = gra;
        y = y + 1;
        Welcome();
    }
    public static void forgotpassword() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Enter Uniqe Id name1 ");
        String username1 = scan.nextLine();
        for (int i = 0; i < user.length; i++) {
            if (user[i][1] == username1) {
                System.out.println("Your Login Id");
               
                System.out.println(user[i][1]);

                Welcome();

              

    }
}
    }}