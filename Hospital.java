package com.google;

import java.util.Scanner;

public class Hospital {
    static int ma =6;
    static Scanner scan = new Scanner(System.in);
    static int Serial = 1234671;
    public static String[][] hospitaldata = new String[10000][6];
    static int n = -1;
    static int y = -1;
    static public String[][] doctor =new String[10000][3];
    public static void main(String[] args) {

        doctor[0][0] = "dr.raju";
        doctor[0][1] = "dr raju";
        doctor[0][2] = "raju";
        doctor[1][0] = "dr.shekawat";
        doctor[1][1] = "dr shekawat";
        doctor[1][2] = "shekawat";
        doctor[2][0] = "dr.vijay";
        doctor[2][1] = "dr vijay";
        doctor[2][2] = "vijay";
        doctor[3][0] = "dr.dinesh";
        doctor[3][1] = "dr dinesh";
        doctor[3][2] = "dinesh";
        doctor[4][0] = "dr.monu";
        doctor[4][1] = "dr monu";
        doctor[4][2] = "monu";
        doctor[5][0] = "dr.sonu";
        doctor[5][1] = "dr sonu";
        doctor[5][2] = "sonu";
        doctor[6][0] = "dr.ishan";
        doctor[6][1] = "dr ishan";
        doctor[6][2] = "ishan";








        welcome();

    }

    public static void welcome() {
        System.out.println("Welcome Back!");

        System.out.println();

        System.out.println("Loading Wait for few seconds...");

        System.out.println(
                "1 .if you add Patiene Enter - add       2. if you List Of All Patiene  Enter  -  All                          ");
        System.out.println();

        System.out.println(
                " 3. if you List of General Patiene Enter - General           4. if you List of obc  Patiene Enter  - obc ");
        System.out.println();
        System.out.println(
                "5.if you Need of Other Patiene Enter - other 6. if Need which Doctor Mostly Check Patiene Enter-Doctor    ");
        
        

System.out.println();
System.out.println(" 7. If you Add new Doctor in Hospital - newdc  ");
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter Which You Need");
        String Need = scan.nextLine();

        if (Need.equalsIgnoreCase("add")) {
            informationstored();
        } else {
            if (Need.equalsIgnoreCase("all")) {
                alllist();
            } else {
                if (Need.equalsIgnoreCase("General")) {

                    genlist();

                } else {
                    if (Need.equalsIgnoreCase("Other")) {
                        othlist();
                    } else {
                        if (Need.equalsIgnoreCase("Doctor")) {
                            mostalychck();
                        } else {
                            if (Need.equalsIgnoreCase("Antendence")) {
                                addatendence();
                            } else {
                                if (Need.equalsIgnoreCase("Doctoratendence")) {
                                    addatendence();
                                } else {
                                    if (Need.equalsIgnoreCase("obc")) {
                                        obclist();
                                    }
                                    else{
                                        if (Need.equalsIgnoreCase("newdc")) {
                                                adddoctor();                                        
                                        }
                                    }
                                }

                            }
                        }
                    }
                }

            }
        }
    }

    public static void informationstored() {

        System.out.println("Name of Patiene");
        String name = scan.nextLine();

        System.out.println("Patiene is Male , Female , Other...");
        String Mfo = scan.nextLine();

        System.out.println("Age of Patiene ");
        int age = scan.nextInt();
        String age1 = String.valueOf(age);

        System.out.println("Which doctor check Patiene ");

        String doctor = scan.nextLine();
        String doctor1 = scan.nextLine();

        System.out.println("What patient Cast - General , obc , Other ");

        String cast = scan.nextLine();

        String serail1 = String.valueOf(Serial + 7);

        Serial = Serial + 7;

        hospitaldata[0][0] = name;
        hospitaldata[0][1] = Mfo;
        hospitaldata[0][2] = age1;
        hospitaldata[0][3] = doctor;
        hospitaldata[0][4] = serail1;
        hospitaldata[0][5] = cast;

        System.out.println("Patiene check Ruppes");
        if (cast.equalsIgnoreCase("general")) {
            System.out.println("10 Ruppes of Patiene check");
        } else if (cast.equalsIgnoreCase("obc")) {
            System.out.println("5 Ruppes of Patiene check");
        } else if (cast.equalsIgnoreCase("other")) {
            System.out.println("Free Patiene check");
        }
        welcome();

    }

    public static void alllist() {
        for (int i = 0; i < hospitaldata.length; i++) {
            if (hospitaldata[i][0] == null) {

            } else {
                System.out.println(hospitaldata[i][0]);

            }
        }
        welcome();

    }

    public static void genlist() {

        for (int i = 0; i < hospitaldata.length; i++) {
            if (hospitaldata[i][5].equalsIgnoreCase("general")) {
                System.out.println(hospitaldata[i][0]);
                System.out.println("General");
                System.out.println("");
                welcome();
            }
        }

    }

    public static void othlist() {
        for (int i = 0; i < hospitaldata.length; i++) {
            if (hospitaldata[i][5].equalsIgnoreCase("other")) {
                System.out.println(hospitaldata[i][0]);
                System.out.println("other");
                System.out.println("");
                
            }}}
            public static void obclist() {
                for (int i = 0; i < hospitaldata.length; i++) {
                    if (hospitaldata[i][5].equalsIgnoreCase("obc")) {
                        System.out.println(hospitaldata[i][0]);
                        System.out.println("obc");
                        System.out.println("");
                        
                    }}
        
    }

    public static void mostalychck() {
       
        String enterdoc = scan.nextLine();
for (int i = 0; i < hospitaldata.length; i++) {
    if (hospitaldata[i][3].equalsIgnoreCase("dr.raju")) {
        
    }else{
        if (hospitaldata[i][3].equalsIgnoreCase("dr raju")) {
            
        }
        else{
            if (hospitaldata[i][3].equalsIgnoreCase("raju")) {
            
            }
            else{
                if (hospitaldata[i][3].equalsIgnoreCase("dr.shekawat")) {
            
                }
                else{ if (hospitaldata[i][3].equalsIgnoreCase("dr shekawat")) {

            
                }
                else{  if (hospitaldata[i][3].equalsIgnoreCase("shekawat")) {
            
                }
                else{
                    if (hospitaldata[i][3].equalsIgnoreCase("dr.dinesh")) {
                
                    }
                    else{ if (hospitaldata[i][3].equalsIgnoreCase("dr dinesh")) {
    
                
                    }
                    else{  if (hospitaldata[i][3].equalsIgnoreCase("dinesh")) {
                
                    }
                    else{
                        if (hospitaldata[i][3].equalsIgnoreCase("dr.vijay")) {
                    
                        }
                        else{ if (hospitaldata[i][3].equalsIgnoreCase("dr vijay")) {
        
                    
                        }
                        else{  if (hospitaldata[i][3].equalsIgnoreCase("vijay")) {
                    
                        }else{
                            if (hospitaldata[i][3].equalsIgnoreCase("dr.monu")) {
                        
                            }
                            else{ if (hospitaldata[i][3].equalsIgnoreCase("dr monu")) {
            
                        
                            }
                            else{  if (hospitaldata[i][3].equalsIgnoreCase("monu")) {
                        
                            }else{
                if (hospitaldata[i][3].equalsIgnoreCase("dr.sonu")) {
            
                }
                else{ if (hospitaldata[i][3].equalsIgnoreCase("dr sonu")) {

            
                }
                else{  if (hospitaldata[i][3].equalsIgnoreCase("sonu")) {
            
                }else{
                    if (hospitaldata[i][3].equalsIgnoreCase("dr.ishan")) {
                
                    }
                    else{ if (hospitaldata[i][3].equalsIgnoreCase("dr ishan")) {
    
                
                    }
                    else{  if (hospitaldata[i][3].equalsIgnoreCase("ishan")) {
                
                    }
                   }welcome();
               }}}}}
                           }
                       }
                   }
               }
               }}}
               
            }
                        
        }
    }
}}}
    }}}

    public static void Atendence() {
        System.out.println("Atendence");
        welcome();
    }

    public static void addatendence() {
        System.out.println("addAtendence");
        welcome();
    }

    public static void adddoctor() {
      System.out.println("Name of Doctor");
      String name =scan.nextLine();
      System.out.println("Age of Doctor" );
      String age = scan.nextLine();
      
      System.out.println("mobile no. ");
      String mobileno =scan.nextLine();

      doctor[ma][0]=name; 

    }

}
