package Project;

import java.util.Scanner;
public class STUDENT{
    String st_name;
    String st_address;
    int total_mark;
    int total_cgpa ;
    String parent_name;


    public void get_details() {
        System.out.println("Student Name: "+st_name);
        System.out.println("Student Address: "+st_address);
        System.out.println("Parent Name: "+parent_name);
        System.out.println("Total mark: "+total_mark);
        System.out.println("Total CGPA : "+total_cgpa);

    }

    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER STUDENT DETAILS *** =======================");
        System.out.println();
        System.out.print("Student NAME: ");
        st_name = sc.nextLine();
        System.out.print(("Student ADDRESS: "));
        st_address = sc.nextLine();
        System.out.print("Parent NAME: ");
        parent_name = sc.nextLine();
        System.out.print("TOTAL NO OF MARK IN 12TH: ");
        total_mark = sc.nextInt();
        System.out.print("TOTAL CGPA: ");
        total_cgpa
                = sc.nextInt();

    }
}