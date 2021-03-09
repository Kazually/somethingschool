public class Students {
    String name;
    Courses[] courses;
    int index = 0;

    Students(String name){
        this.name = name;
        courses = new Courses[2];
    }

    private Courses[] addCourse(Courses courses){
        Courses[] returnVal = new Courses[courses.length +1];
        return returnVal;
    }

    public void addcourse(Courses courses){
        if(index < 2){
            courses[index] = courses;
            index ++;
        }
        else {
            courses = addCourse(courses);
        }
    }
}
