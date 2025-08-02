import java.util.ArrayList;
import java.util.List;

/**
 * main.java.CourseList is a class that contains a list of main.java.Course objects.
 * It is like a semester.
 */
public class CourseList {
    protected List<Course> courses = new ArrayList<>();

    public CourseList() {

    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void deleteCourse(int index) {
        if (index < courses.size()) {
            courses.remove(index);
        }
    }

    public void listCourses() {
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(
                    "<" + (i + 1) + "> " +
                            courses.get(i).getCredit() + " MCs" + "\t" +
                            courses.get(i).getGrade() + " GPA" + "\t" +
                            courses.get(i).getInfo()
            );
        }
    }

    public double getFixedSemGrade() {
        double totalGrade = 0;
        double totalCredit = 0;
        for (Course c : courses) {
            if (c.isFixed()) {
                totalGrade += c.getGrade() * c.getCredit();
                totalCredit += c.getCredit();
            }
        }
        return totalCredit == 0 ? 0 : totalGrade / totalCredit;
    }
    
    public int getFixedSemCredit() {
        int totalCredit = 0;
        for (Course c : courses) {
            if (c.isFixed()) {
                totalCredit += c.getCredit();
            }
        }
        return totalCredit;
    }

    public int getUnfixedSemCredit() {
        int totalCredit = 0;
        for (Course c : courses) {
            if (!c.isFixed()) {
                totalCredit += c.getCredit();
            }
        }
        return totalCredit;
    }

    public void editCourse(int index, int credit, double grade) {
        if (index < courses.size()) {
            courses.get(index).setCredit(credit);
            courses.get(index).setGrade(grade);
        }
    }

    public void editCourse(int index, int credit) {
        if (index < courses.size()) {
            courses.get(index).setCredit(credit);
        }
    }

    public void editCourse(int index, double grade) {
        if (index < courses.size()) {
            courses.get(index).setGrade(grade);
        }
    }

    public void editCourse(int index, String info) {
        if (index < courses.size()) {
            courses.get(index).setInfo(info);
        }
    }

    public void fixCourse(int index) {
        if (index < courses.size()) {
            courses.get(index).setFixed(true);
        }
    }

    public void unfixCourse(int index) {
        if (index < courses.size()) {
            courses.get(index).setFixed(false);
        }
    }
}
