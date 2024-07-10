package Project;

import java.util.*;
import java.lang.*;

public class Main {

    static void main_menu(){
        System.out.println();
        System.out.println("======================= *** WELCOME TO STUDENT MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD DETAILS \t\t\t 2].NEW STUDENT FOR ADMISSION");
        System.out.println();
        System.out.println("4].GET DETAILS \t\t\t 5].NEW STUDENT DETAILS OF ADMISSION");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        STUDENT stud[] = new STUDENT[5];
        PERSONAL details[] = new PERSONAL[5];


        int st_counter = 0;
        int per_counter = 0;
        int choice = 100;
        while(choice!=0){

            main_menu();
            choice = sc.nextInt();

            while(choice!=9 && choice!=0){
                switch (choice) {
                    case 1:
                        stud[st_counter] = new STUDENT();
                        stud[st_counter].set_details();
                        st_counter++;
                        System.out.println();
                        System.out.println("1].ADD STUDENT DETAILS");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        details[per_counter] = new PERSONAL();
                        details[per_counter].set_details();
                        per_counter++;
                        System.out.println();
                        System.out.println("2].ADD NEW STUDENT");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        for (int i = 0; i < st_counter; i++) {
                            stud[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for (int i = 0; i < per_counter; i++) {
                            details[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE: ");
                        break;
                }
            }
        }

    }
}

