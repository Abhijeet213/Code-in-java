package com.google;

import java.util.Random;
import java.util.Scanner;

public class sps {
    public static int Com;
    public static int usr;

    public static void main(String[] args) {



welcome();

    }

    private static void welcome() {
        sps();
        
    }

    public static void sps() {

        System.out.println("Welcome to gametoday");
      
        System.out.println("Chose - 0 to Stone  1 - Papre   2 - Sciesor  ");
        Scanner bac = new Scanner(System.in);
        int f = bac.nextInt();
        Random num = new Random();

        int n = num.nextInt(3);

        switch (n) {
            case 0:
                Com = 0;
               
                
                System.out.println("Computer Choice - ");
                System.out.println("Stone");

                break;
            case 1:
                Com = 1;
                
                
                System.out.println("Computer Choice - ");
                System.out.println("papre");

                break;

            case 2:
                Com = 2;
            
                
                System.out.println("Computer Choice - ");
                System.out.println("Sciesor");

                break;

            default:
                Com = -1;
        }
        switch (f) {
            case 0:
                usr = 0;
              
                
                System.out.println("User Choice - ");
                System.out.println("Stone");

                break;
            case 1:
                usr = 1;
               
                
                System.out.println("User Choice - ");
                System.out.println("Papre");

                break;

            case 2:
                usr = 2;
                
                
                System.out.println("User Choice - ");
                System.out.println("Sciesor");

                break;

            default:
                usr = -1;

        }
       if (usr == -1) {
           System.out.println("You Enter Wrong Choice ");
           welcome();
       }
       if (Com == -1) {
        System.out.println("Computer Enter Wrong Choice ");
        welcome();
    }
        if (Com == usr) {
          
            
            System.out.println("Draw!");
            welcome();
            
        } else if(Com == 0 && usr == 1
         ){
          
            
            System.out.println("You Win !!");

        }else if(Com == 1 && usr == 0 ){
           
            
            System.out.println("Oh NO Computer Win ");

        }
        else if(Com == 2 && usr == 1){
            
            
            System.out.println("Oh NO Computer Win ");
        }
        else if(Com == 1 && usr == 2){
           
            
            System.out.println("You Win !!");
        }
        else if(Com == 0  && usr == 2){
         
            
            System.out.println("Oh NO Computer Win ");
        } 
        else if(Com == 2 && usr == 0){
        
            
            System.out.println("You Win !!");
        }

        welcome();
             

            
        }

    }

