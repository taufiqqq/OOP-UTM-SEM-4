//import inheritence.Human;

public class Person extends Human{
    private String occupation;
    private String country;
    private String address;

    Person(){
        occupation = "";
        country = "";
        address = "";
    }

    public Person(String occupation, String country, String address) {
        this.occupation = occupation;
        this.country = country;
        this.address = address;
    }    

    public Person(String name, String gender, int age, String occupation, String country, String address) {
        super(name, gender, age);
        this(occupation, country, address);
        // this.occupation = occupation;
        // this.country = country;
        // this.address = address;
    }

    @Override
    public String toString(){
        return name + ", " + gender + ", " + age + ", " + occupation + ", " + address + ", " + country;
    }
    
}
