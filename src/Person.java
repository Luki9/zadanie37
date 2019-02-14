 public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

     public Person() {
     }

     public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName)throws NameUndfinedException {
        if (firstName == null ) throw   new NullPointerException();
        if (firstName.length() < 2 ) throw  new NameUndfinedException();
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName)throws NameUndfinedException {
        if ( lastName == null) throw   new NullPointerException();
        if ( lastName.length() <2) throw  new NameUndfinedException();


        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 )throw  new IncorrectAgeException();
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Person(String firstName, String lastName, int age, String pesel)  {
        if (firstName == null || lastName == null) throw   new NullPointerException();
        if (firstName.length() < 2 || lastName.length() <2) throw  new NameUndfinedException();
        if (age < 1) throw  new IncorrectAgeException();


        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
