public class Person {               // Klass är en mall av ett objekt

    String name;                    // Instansvariabler
    String phoneNumber;
    int age;


    public Person()  {
        this.name = "--";
        this.phoneNumber = "--";
        this.age = 0;
    }

    public Person(String name, String phoneNumber, int age ) {   // Konstruktör
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;

    }

    public void greet() {   //Metoder
        System.out.println("Hej jag heter " + this.name);
    }

    public String toString() {
        return "Name: " + this.name +
                " Phone: " + this.phoneNumber +
                " Age " + this.age;
    }



}
