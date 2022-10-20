package com.google;

import java.util.Random;
import java.util.Scanner;

class game {
    private int rncom;
    private int numberofguess;

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

    game() {
        Random num = new Random();
        rncom = num.nextInt(101);
    }

    public int usrinput() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number Beetwen 0 to 100");
        int inusr = scan.nextInt();

        return inusr;
    }

    public String correctnumber(int user, int com) {

        if (user < com) {
            return "less";

        } else if (user > com) {
            return "greater";
        } else if (com == user) {
            return "equal";
        }

        return "";
    }

}

public class GTN {

    public static void welcome() {
        System.out.println("Welcome To gametoday");

        System.out.println("Let go To Level");

        mn();
    }

    public static void main(String[] args) {
        welcome();
    }

    public static void mn() {

        game gm = new game();

        int rm = gm.getRncom();
        int numofgus = gm.getNumberofguess();
        int usr = gm.usrinput();
        for (boolean i = true; i == true;) {

            String s = gm.correctnumber(usr, rm);
            if (s == "less") {
                System.out.println("Oh No !!!");
                System.out.println(" One Minus -1 to Your Point ");
                System.out.println("");
                numofgus = numofgus - 1;
                System.out.println("Your Point is " + numofgus);

                System.out.println("You Enter less  number to Computer Number: ");
                System.out.println("");
                usr = gm.usrinput();

            } else if (s == "greater") {
                System.out.println("Oh No !!!");

                System.out.println(" One Minus -1 to Your Point ");

                System.out.println("");

                numofgus = numofgus - 1;

                System.out.println("Your Point is " + numofgus);

                System.out.println("You Enter grater number to Computer Number: ");
                System.out.println("");
                usr = gm.usrinput();
                System.out.println("");
                System.out.println();

            } else if (s == "equal") {

                System.out.println("Oh Yes !!!");
                System.out.println(" One Plus +1 to Your Point ");

                System.out.println("");

                numofgus = numofgus + 1;

                System.out.println("Your Point is " + numofgus);

                System.out.println("your Number Equals to Computer Number: ");
                System.out.println("");

                System.out.println("If You Enter Next Level 0 - Yes 1 - No ");
                Scanner scan = new Scanner(System.in);
                int ufd = scan.nextInt();
                if (ufd == 0) {
                    welcome();
                }
                if (ufd == 1) {
                    break;

                }

            }

        }

    }

}
