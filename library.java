package com.quick;

import java.util.Scanner;

class library {
    int issuea = 0;
    Scanner scan = new Scanner(System.in);
    int availablen = 13;
    String[][] available = new String[13][3];
    String[][] issue = new String[0][4];

    public void addbook() {
        System.out.println("Name of Book");
        String namebo = scan.nextLine();
        System.out.println("Enter Name Of Writer");
        String namewri = scan.nextLine();
        System.out.println("Date of Lanuch");
        String date = scan.nextLine();
        System.out.println("Row");
        String row = scan.nextLine();
        available[availablen + 1][0] = namebo;
        available[availablen + 1][1] = namewri;
        available[availablen + 1][2] = date;
        available[availablen + 1][3] = row;
        availablen = availablen + 1;
        System.out.println("Thanks For Using Library");
    }

    public void issueBook() {
        System.out.println("Enter book name");
        String boname = scan.nextLine();
       for (int i = 0; i < issue.length; i++) {
           
       
        if (issue[i][0] == boname) {
            System.out.println("Oh no this book is Out Of Stock!!");
            welcome();
            
        }
        else{}
    } 
        for (int i = 0; i < available.length; i++) {

            if (available[i][0].equalsIgnoreCase(boname)) {
             issue [][]
                System.out.println("Enter Your Name ");
                String yona = scan.nextLine();
                        

            }
    
            
        }



    }

    public void welcome() {

    }

    public void returnBook() {
        System.out.println("You Enter Return Book");
        System.out.println("1Day = 5 Ruppes");
        System.out.println("Enter book name");
        String name = scan.nextLine();
        for (int i = 0; i < available.length; i++) {
            if (available[i][0].equalsIgnoreCase(name)) {
                System.out.println("Sorry! This Book Already Exists");
                welcome();
            } else {
                available[availablen+1][0] =   issue[i][0]; 
                available[availablen+1][1] =   issue[i][0]; 
                issue[i][0] = null;
                issue[i][1] = null;
                issue[i][2] = null;
                issue[i][3] = null;
                issue[i][4] = null;
                System.out.println("How Much Day You Hold Book ");
                int hoda = scan.nextInt();
                int total = 5 * hoda;
                System.out.println("Money of Holding Book " + total + " Ruppes");
                System.out.println("Thanku For Submit Book");

            }

        }

    }

    public void showavailablebook() {
        for (int i = 0; i < available.length; i++) {
            System.out.println(available[i][0]);

        }

    }

}
