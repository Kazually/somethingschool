public class Courses {
    public int length;
    private String firstname;
    private int StudId;
    private static int StudentIDGenerator;

    Courses(String firstname, int studId){
        this.firstname = firstname;
        this.StudId = studId;
        StudId = StudentIDGenerator;
        StudentIDGenerator++;
        System.out.println("student");
    }

    Courses(){
        System.out.println("constructor");
        for (int i = 0; i < 10; i++){
            StudId = StudentIDGenerator;
            StudentIDGenerator++;
        }
    }
    public

}
