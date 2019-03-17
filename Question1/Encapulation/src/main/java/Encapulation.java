public class Encapulation {
    private StudentClass stud;

    public void run(){
        stud =  StudentClass.StudentMaker.newInstance()
                .setStudentName("Moegammad")
                .setCourse("AppDev")
                .setYear_of_study(3)
                .build();

        System.out.println("Student name   :"+stud.getStudentName()
            + "\nCourse enrolled :" +stud.getCourse()
            + "\nYear of study: :" + stud.getYear_of_study());
    }
}
