public enum Course {
    SCSJ2154("Object Oriented Programming", 4),
    SCSD2623("Database Programming", 3),
    SCSV1223("Web Programming", 3),
    SCSJ2203("Software Engineering", 3),
    SCSR2043("Operating System", 3),
    ULAB2122("Advanced Academic English Skills", 2),
    UCSD2762("Fundamentals of Technopreneurship", 2),
    SCSD3761("Technopreneurship Seminar", 1);

    String description;
    int credit;
    char grade;

    Course(String description, int credit) {
        this.description = description;
        this.credit = credit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public double getGradeValue() {
        if (grade == 'A')
            return 4.0;
        else if (grade == 'B')
            return 3.0;
        else if (grade == 'C')
            return 2.0;
        else if (grade == 'D')
            return 1.0;
        else if (grade == 'E')
            return 0.0;
        else
            return -1;
    }
}
