public class Student {
    private String name;
    private String matricNumber;
    private double GPA;
    static int totalCredit;

    public Student() {
    totalCredit = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatricNumber() {
        return matricNumber;
    }

    public void setMatricNumber(String matricNumber) {
        this.matricNumber = matricNumber;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double gPA) {
        GPA = gPA;
    }

    public int getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(int totalCredit) {
        Student.totalCredit += totalCredit;
    }
    
}
