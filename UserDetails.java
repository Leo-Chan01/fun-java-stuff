import java.util.Scanner;

public class UserDetails {

    public static void main(String[] args) {
            System.out.println("Name: ");
            Scanner nameScanner = new Scanner (System.in);
            nameScanner.nextLine();

            System.out.println("Reg No.: ");
            Scanner regScanner = new Scanner (System.in);
            regScanner.nextLine();

            System.out.println("Department");
            Scanner deptScanner = new Scanner (System.in);
            regScanner.nextLine();
            deptScanner.close();
    }
}
