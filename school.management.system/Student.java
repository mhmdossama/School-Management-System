public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }

    /* Used to update student's grade */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /*
     * Used to update student's fees
     * School will update it.
     */
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(fees);
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public double getFeesPaid() {
        return feesPaid;
    }

    public double getFeesTotal() {
        return feesTotal;
    }

    public double getRemainingFees() {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: " + name + ", Total fees paid so far: $" + feesPaid;
    }
}