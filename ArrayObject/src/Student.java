import java.util.Scanner;

public class Student {
    private String name;
    private char gender;
    private int age;
    private String matricNum;

    public Student(String name, String matricNum, char gender){
        this.name = name;
        this.matricNum = matricNum;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public String getMatricNum(){
        return matricNum;
    }

    public char getGender(){
        return gender;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMatricNum(String matricNum){
        this.matricNum = matricNum;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
}
