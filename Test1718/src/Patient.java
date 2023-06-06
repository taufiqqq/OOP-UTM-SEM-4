public class Patient extends Person{
    
    private String patientID;
    private HealthInfo pHealth ;

    public Patient(String firstname, String lastname, String gender, String patientID, Address address, 
           int weight, int height) {
        super(firstname, lastname, gender, address);
        this.patientID = patientID;
        pHealth = new HealthInfo(height, weight); //composition = new constructor
    }

    public String getPatientID() {
        return patientID;
    }

    public int getWeight(){
        return pHealth.getWeight();
    }

    public int getHeight(){
        return pHealth.getHeight();
    }

    public double getBMI(){
        return pHealth.getBmi();
    }






}
