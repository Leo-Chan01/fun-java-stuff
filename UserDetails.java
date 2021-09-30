import java.util.Scanner;

public class UserDetails {

    public static void main(String[] args) {
            System.out.println("Input Your Name: ");
            Scanner nameScanner = new Scanner (System.in);
            nameScanner.nextLine();

            System.out.println("Input Your Reg No.: ");
            Scanner regScanner = new Scanner (System.in);
            regScanner.nextLine();
            regScanner.close();
    }
}
