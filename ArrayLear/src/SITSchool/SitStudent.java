package SITSchool;

/**
 *
 * @author bankcom
 */
public class SitStudent {

    private String nameStd;
    private int studentID = 601305000;
    private double score;
    private char grades;

    private static int numofStudent;

    public SitStudent() {

        numofStudent++;
        this.studentID = this.studentID + numofStudent;
    }

    public SitStudent(String nameStd, double score) {
        this.nameStd = nameStd;
//        this.score = score;
        if (score >= 80) {
            this.grades = 'A';
        } else if (score >= 70) {
            this.grades = 'B';
        } else if (score >= 60) {
            this.grades = 'C';
        } else if (score >= 50) {
            this.grades = 'D';
        } else {
            this.grades = 'F';
        }
        this.score = score;
        numofStudent++;

        this.studentID = this.studentID + numofStudent;
    }

    public String getNameStd() {
        return nameStd;
    }

    public void setNameStd(String nameStd) {
        this.nameStd = nameStd;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public char getGrades() {
        return grades;
    }

    public void setGrades(char grades) {
        this.grades = grades;
    }

    public static int getNumofStudent() {
        return numofStudent;
    }

    public static void setNumofStudent(int numofStudent) {
        SitStudent.numofStudent = numofStudent;
    }

    @Override
    public String toString() {
        return "SitStudent{" + "nameStd=" + nameStd + ", studentID=" + studentID + ", score=" + score + ", grades=" + grades + '}';
    }

}
