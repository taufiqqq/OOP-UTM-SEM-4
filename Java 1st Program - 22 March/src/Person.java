public class Person {
    // properties
    private String name;
    private int yob;
    private float weight, height, bmi;
    private String bmiCategory;

    // constructors
    public Person() {
    }

    public Person(String name, int yob, float weight, float height) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
        this.height = height;
    }

    // methods

    //can remove this particular toString definition to get a different output (original toString)
    //this snippet is to redefine toString
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", yob=" + yob
                + ", weight=" + weight
                + ", height=" + height + ", bmi=" + bmi
                + ", bmiCategory=" + bmiCategory + '}';
    }

}
