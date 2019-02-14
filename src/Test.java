import java.util.Scanner;

class Test {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Person person = new Person("Adam", "Podolski", 25, "23109030");


        System.out.println("Podaj imię osoby");
        String firstName = scanner.nextLine();

        System.out.println("Podaj nazwisko osoby");
        String lastName = scanner.nextLine();

        System.out.println("Podaj wiek ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Podaj pesel osoby");
        String pesel = scanner.nextLine();

        try {
            firstName = scanner.nextLine();
            person.setFirstName(firstName);

        } catch (NullPointerException e) {
            System.out.println("Imię/nazwisko ");
        } catch (NameUndfinedException e) {
            System.out.println("Niepoprawne imię/nazwisko");

        } catch (IncorrectAgeException e) {
            System.out.println("Niepoprawny wiek");
        }

        System.out.println(person.toString());


    }
}


