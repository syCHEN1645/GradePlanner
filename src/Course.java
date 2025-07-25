public class Course {
    private int credit;
    private float grade;
    private String info;

    public Course(int credit, float grade) {
        this.credit = credit;
        this.grade = grade;
        this.info = "";
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
