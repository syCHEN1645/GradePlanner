import java.util.List;

public abstract class CourseList {
    protected List<Course> courses;
    boolean fixed;

    public boolean isFixed() {
        return fixed;
    }

    public void setFixed(boolean fixed) {
        this.fixed = fixed;
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

    public float calculateSemGrade() {
        float totalGrade = 0;
        float totalCredit = 0;
        for (Course c : courses) {
            totalGrade += c.getGrade() * c.getCredit();
            totalCredit += c.getCredit();
        }
        return totalCredit == 0 ? 0 : totalGrade / totalCredit;
    }
}
