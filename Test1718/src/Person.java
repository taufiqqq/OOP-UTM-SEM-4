public class Person {
    
    protected String firstname;
    protected String lastname;
    protected String gender;
    protected Address address;

    public Person(String firstname, String lastname, String gender, Address address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.address = address; //aggregation
    }

    public String getFullName(){
        return firstname + " " + lastname;
    }

    public String getGender(){
        return gender;
    }

    public Address getAddress(){
        return address; //object 
    }

    
}
