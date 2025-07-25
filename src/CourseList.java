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
    
    public int calculateSemCredit() {
        int totalCredit = 0;
        for (Course c : courses) {
            totalCredit += c.getCredit();
        }
        return totalCredit;
    }

    public void editCourse(int index, int credit, float grade) {
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

    public void editCourse(int index, float grade) {
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
