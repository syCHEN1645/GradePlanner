public class Course {
    private int credit;
    private double grade;
    private String info;
    private boolean fixed;

    public Course(int credit, double grade) {
        this.credit = credit;
        this.grade = grade;
        this.info = "";
        this.fixed = false;
    }

    public Course(int credit, double grade, boolean fixed) {
        this.credit = credit;
        this.grade = grade;
        this.info = "";
        this.fixed = fixed;
    }

    public boolean isFixed() {
        return fixed;
    }

    public void setFixed(boolean fixed) {
        this.fixed = fixed;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
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
