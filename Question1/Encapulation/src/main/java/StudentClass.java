public class StudentClass {
    private String studentName;
    private String course;
    private int year_of_study;

    public String getStudentName() {
        return studentName;
    }

    public String getCourse() {
        return course;
    }


    public int getYear_of_study() {
        return year_of_study;
    }

    public StudentClass(StudentMaker StudentMaker){
        this.studentName = StudentMaker.studentName;
        this.course = StudentMaker.course;
        this.year_of_study = StudentMaker.year_of_study;
    }

    public static class StudentMaker{
        private String studentName;
        private String course;
        private int year_of_study;

        public static StudentMaker newInstance(){
            return new StudentMaker();
        }

        public StudentMaker setStudentName(String studentName) {
            this.studentName = studentName;
            return this;
        }

        public StudentMaker setCourse(String course){
            this.course = course;
            return this;
        }

        public StudentMaker setYear_of_study(int year_of_study){
            this.year_of_study = year_of_study;
            return this;
        }

        public StudentClass build(){
            return new StudentClass(this);
        }
    }
}
