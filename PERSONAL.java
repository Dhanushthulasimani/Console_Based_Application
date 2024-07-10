package Project;

import java.util.Scanner;
import java.util.UUID;
public class PERSONAL extends STUDENT{
    String std_id;
    String std_name;
    int std_age;
    String std_nationality;
    String std_department;


    @Override
    public void get_details() {
        System.out.println("ID: "+std_id);
        System.out.println("Name: "+std_name);
        System.out.println("Age: "+std_age);
        System.out.println("Department: "+std_department);
        System.out.println("Student Nationality: "+std_nationality);

    }
    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        std_id = String.valueOf(uuid);
        System.out.println("======================= *** ENTER STUDENT PERSONAL DETAILS *** =======================");
        System.out.println();
        System.out.print("STUDENT NAME: ");
        std_name = sc.nextLine();
        System.out.print(("STUDENT AGE: "));
        std_age = sc.nextInt();
        sc.nextLine();
        System.out.print("STUDENT DEPARTMENT: ");
        std_department = sc.nextLine();
        System.out.print("STUDENT NATIONALITY: ");
        std_nationality = sc.nextLine();

    }
}
