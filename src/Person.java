import java.time.Year;

public class Person {
    private String firstName = "Sonia";
    private String lastName = "Kabor";
    private String address = "Bollywood";
    private int dateOfBirth = 1980;
    private String nationality = "indian";
    private String city = "Mombi";
    private double weight = 50;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double height = 165;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public String getCity() {
        return city;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public boolean isMale() {
        return isMale;
    }

    private boolean isMale = false;
    public static int count = 0;

    public Person() {
    }

    public Person(String firstName, String lastName, String address, int dateOfBirth, String nationality, String city, double weight, double height, boolean isMale) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.city = city;
        this.weight = weight;
        this.height = height;
        this.isMale = isMale;
        this.count++;
    }

    public String fullName() {


        return this.firstName + " " + this.lastName;
    }

    public double getHeightInFeet() {
        return this.height * 0.0328084;
    }

    public int getAge() {
        return Year.now().getValue() - this.dateOfBirth;
    }

    public void eating() {
        System.out.println("Im eating!");
        this.weight++;
    }

    public String getInfo() {
       return "Name: " + this.fullName() + "\nAddress: " + this.address + "\ndate of birth: " + this.dateOfBirth;
    }
}
