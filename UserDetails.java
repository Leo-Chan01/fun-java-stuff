import java.util.Scanner;

public class UserDetails {

    private static String name;
    private static String regNo;
    private static String department;


    public static void main(String[] args) {
            System.out.println("Name: ");
            Scanner nameScanner = new Scanner (System.in);
            nameScanner.nextLine();
            name = nameScanner.toString();
            
            System.out.println("Reg No.: ");
            Scanner regScanner = new Scanner (System.in);
            regScanner.nextLine();
            regNo = regScanner.toString();

            System.out.println("Department");
            Scanner deptScanner = new Scanner (System.in);
            deptScanner.nextLine();
            department = deptScanner.toString();
            deptScanner.close();
            
    }

    public String getName() {
        System.out.println("Name: ");
        Scanner nameScanner = new Scanner (System.in);
        nameScanner.nextLine();
        name = nameScanner.toString();
        return name;
    }

    public void setName(String name) {
        UserDetails.name = name;
    }

    public String getRegNo() {
        System.out.println("Reg No.: ");
        Scanner regScanner = new Scanner (System.in);
        regScanner.nextLine();
        regNo = regScanner.toString();
        return regNo;
    }

    public void setRegNo(String regNo) {
        UserDetails.regNo = regNo;
    }

    public String getDepartment() {
        System.out.println("Department");
        Scanner deptScanner = new Scanner (System.in);
        deptScanner.nextLine();
        department = deptScanner.toString();
        deptScanner.close();
        return department;
    }

    public void setDepartment(String department) {
        UserDetails.department = department;
    }
}
