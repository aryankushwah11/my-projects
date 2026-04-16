import java.util.Scanner;

public class AddressProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your house number: ");
        String house = sc.nextLine();

        System.out.print("Enter your street: ");
        String street = sc.nextLine();

        System.out.print("Enter your city: ");
        String city = sc.nextLine();

        System.out.print("Enter your state: ");
        String state = sc.nextLine();

        System.out.print("Enter your PIN code: ");
        String pin = sc.nextLine();

        // Displaying address
        System.out.println("\n--- Your Address ---");
        System.out.println(name);
        System.out.println(house + ", " + street);
        System.out.println(city + ", " + state + " - " + pin);

        sc.close();
    }
}