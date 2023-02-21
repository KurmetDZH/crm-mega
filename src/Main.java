import LessonInterface.CourseFormat;
import LessonInterface.Courses;
import LessonInterface.Mentor;

public class Main {
    public static void main(String[] args) {

        Courses courses = new Courses();
        courses.setName("Java ");
        courses.setPrice(15000);

        CourseFormat bootcamp = new CourseFormat();
        bootcamp.setFormat("Bootcamp ");
        bootcamp.setId(1);
        bootcamp.setDurationInWeek(5);
        bootcamp.setOnline(true);
        bootcamp.setLessonCountPerWeek(5);
        bootcamp.setLessonDuration(3);
        courses.setCourseFormat(bootcamp);
        System.out.println(courses.toString());
    }
}