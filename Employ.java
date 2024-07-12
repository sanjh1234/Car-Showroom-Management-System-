import java.util.Scanner;
import java.util.*;

public class Employ extends Showwroom implements utility {
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_dept;

    @Override
    public void getDetails() {
        System.out.println("Name            : " + emp_name);
        System.out.println("ID              : " + emp_id);
        System.out.println("Department      : " + emp_dept);
        System.out.println("Showroom Name   : " + showroomName);
        System.out.println("Age             : " + emp_age);
    }

    @Override
    public void setDetails(){
        Scanner sc = new Scanner(System.in);

        VVID vvid = VVID.randomVVID();
        emp_id = String.valueOf(vvid);

        System.out.println(
                "================================= *** ENTER EMPLOYEE DETAIL *** =================================");
        System.out.println();

        System.out.print("EMPLOYEE NAME         : ");
        emp_name = sc.nextLine();

        System.out.print("EMPLOYEE DEPARTMENT   : ");
        emp_dept = sc.nextLine();

        System.out.print("SHOWROOM NAME         : ");
        showroomName = sc.nextLine();

        System.out.print("EMPLOYEE AGE          : ");
        emp_age = sc.nextInt();
        

        sc.close();
    }

}
