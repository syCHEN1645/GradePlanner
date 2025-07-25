import java.util.List;

public abstract class CourseList {
    private List<Course> courses;

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void deleteCourse(int index) {
        if (index < courses.size()) {
            courses.remove(index);
        }
    }

    public abstract void calculateSemGrade();
}
