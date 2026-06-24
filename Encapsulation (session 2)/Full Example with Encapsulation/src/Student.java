class Student {

    private String name;
    private double grade;

    // Setter برای name
    public void setName(String name) {
        this.name = name;
    }

    // Getter برای name
    public String getName() {
        return name;
    }

    // Setter برای grade
    public void setGrade(double grade) {

        if(grade >= 0 && grade <= 20) {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade");
        }
    }

    // Getter برای grade
    public double getGrade() {
        return grade;
    }
}