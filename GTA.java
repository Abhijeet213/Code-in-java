package com.google;


import java.util.Random;
import java.util.Scanner;

class game1 {
public static int fgram ;
    private int rncom;
    private int numberofguess;
    private String user;

    public int getNumberofguess() {
        return numberofguess;
    }

    public void setNumberofguess(int numberofguess) {
        this.numberofguess = numberofguess;
    }

    public int getRncom() {
        return rncom;
    }

    public void setRncom(int rncom) {
        this.rncom = rncom;
    }

    game1() {
        Random num = new Random();
        rncom = num.nextInt(27);
    }


    public String usrinput() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter alphabat BeTwenn A to Z");
        String inusr = scan.nextLine();

        return inusr;
    }

    public String correctnumber(String user) {
       
        int wh  =-1 ;
     
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i > -1; i++ ) {
            if (alpha.charAt(i) == user.charAt(0)) {

               wh =wh+2;
                break;
            }
            else{
                wh = wh+1;

            }}
            System.out.println(wh);
       
        if (wh < fgram) {
            return "less";

        } else if (wh > fgram) {
            return "greater";
        } else if (fgram == wh) {
            return "equal";
        }

       
    
    return "ad";
}

public class GTA {
    public static void main(String[] args) {
        welcome();
    }
    public static void welcome() {
       System.out.println("Welcome To gametoday"); 
       
       System.out.println("Let go To Level");

       mn();
    }
    

    public static void mn (){

        game1 gm = new game1();

        int rm = gm.getRncom();
        int numofgus = gm.getNumberofguess();
        String usr = gm.usrinput();
        fgram = rm ;
        for (boolean i = true; i == true;) {
System.out.println(rm);
            String s = gm.correctnumber(usr);
            if (s == "less") {
                System.out.println("Oh No !!!");
                System.out.println(" One Minus -1 to Your Point ");
                System.out.println("");
                numofgus = numofgus - 1;
                System.out.println("Your Point is " + numofgus);

                System.out.println("You Enter less  Alphabate to Computer Alphabate: ");
                System.out.println("");
                usr = gm.usrinput();
               
            } else if (s == "greater") {
                System.out.println("Oh No !!!");

                System.out.println(" One Minus -1 to Your Point ");

                System.out.println("");

                numofgus = numofgus - 1;

                System.out.println("Your Point is " + numofgus);

                System.out.println("You Enter grater Alphabate to Computer Alphabate: ");
                System.out.println("");
                usr = gm.usrinput();
                System.out.println("");
 System.out.println();
              
            } else if (s == "equal") {

                System.out.println("Oh Yes !!!");
                System.out.println(" One Plus +1 to Your Point ");

                System.out.println("");

                numofgus = numofgus+1;

                System.out.println("Your Point is " + numofgus);


                System.out.println("your Alphabate Equals to Computer Alphabate: ");
                System.out.println("");
               
                System.out.println("If You Enter Next Level 0 - Yes 1 - No ");
Scanner scan = new Scanner(System.in);             
                int ufd = scan.nextInt();
                if(ufd == 0){
                    welcome();
                }
                if (ufd ==1) {
                    break;
                    
                }


            }

        }
    



    }

       
}}

