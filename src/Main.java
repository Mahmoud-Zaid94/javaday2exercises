public class Main {

    public static void main(String[] args) {

        Person[] persons = new Person[4];

        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person("waleed" + (i + 1), "zaid", "Amman", 1990, "jordanian", "Amman", 75, 175, true);
        }


        for (int i = 0; i < persons.length; i++) {
            System.out.println("Person " + (i + 1) + ": \n" + persons[i].getInfo() + "\n;------------------------------\n\n");
        }

        System.out.println("Persons count = " + Person.count);

        persons[0].setAddress("Irbid");

        System.out.println(persons[0].getAddress());
    }
}