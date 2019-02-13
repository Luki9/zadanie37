import java.util.Scanner;

class Test {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
   //     Person person = new Person("Adam", "Podolski", 25, "23109030");

        System.out.println("Podaj imię osoby");
        String firstName = scanner.nextLine();

        System.out.println("Podaj Nazwisko osoby");
        String lastName = scanner.nextLine();

        System.out.println("Podaj wiek ");
        int age = scanner.nextInt();

        System.out.println("Podaj pesel osoby");
        String pesel = scanner.nextLine();


    }

}
