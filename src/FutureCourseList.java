public class FutureCourseList extends CourseList {
    @Override
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
}
