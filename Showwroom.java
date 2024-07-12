import java.util.Scanner;

public class Showwroom implements utility {

    String showroomName;
    String showroomAddress;
    int total_employees;
    int tota_cars = 0;
    String managerName;

    @Override
    public void getDetails() {
        System.out.println("SHOWROOM NAME       : " + showroomName);
        System.out.println("SHOWROOM ADDRESS    : " + showroomAddress);
        System.out.println("MANAGER NAME        : " + managerName);
        System.out.println("TOTAL EMPLOYEES     : " + total_employees);
        System.out.println("TOTAL CARS          : " + tota_cars);
    }

    @Override
    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "========================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =========================");
        System.out.println(
                "================================= *** ENTER SHOWROOM DETAIL *** =================================");
        System.out.println();
        
        System.out.print("SHOWROOM NAME       : ");
        showroomName = sc.nextLine();
        
        System.out.print("SHOWROOM ADDRESS    : ");
        showroomAddress = sc.nextLine();
        
        System.out.print("MANAGER NAME        : ");
        managerName = sc.nextLine();
        
        System.out.print("TOTAL EMPLOYEES     : ");
        total_employees = sc.nextInt();
        
        System.out.print("TOTAL CARS          : ");
        tota_cars = sc.nextInt();

        sc.close();
    }
}