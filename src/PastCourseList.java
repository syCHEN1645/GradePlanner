public class PastCourseList extends CourseList {
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
