public class UnderGraduate {

    private String student_no = "209135816";
    private String courseStudying = "AppDev";
    private String name = "Moegammad";
    private int no_of_years_studied = 3;

    public void welcome(){
        System.out.println("\nInheritance");
    }

    public String getStudent_no(){
        return student_no;
    }

    public String getCourse() {
        return courseStudying;
    }

    public String getName() {
        return name;
    }

    public int getNo_of_years_studied() {
        return no_of_years_studied;
    }

    @Override
    public String toString() {
        return  "Student no:         : " + getStudent_no()
                +"\nCourse        : " + getCourse()
                +"\nName        : " + getName()
                +"\nYears studied : "+ getNo_of_years_studied();
    }
}
