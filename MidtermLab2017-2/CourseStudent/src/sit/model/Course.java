package sit.model;

public class Course {

    private String courseName;
    private RegisStudent[] students;

    private int numberOfStudents;

    public Course(String courseName, int numOfStudentCanRegis) {

        students = new RegisStudent[numOfStudentCanRegis];
        this.courseName = courseName;
        this.numberOfStudents = 0;

    }

    public int addStudent(RegisStudent student) {
        int Checked = 1;

        //เช็คกรณีมันเท่ากัน
        for (int i = 0; i < numberOfStudents; i++) {
            if (student.equals(students[i])) {
                Checked = 0;

            }
        }

        if (Checked == 1) {
            if (numberOfStudents < students.length) {
                //เพิ่มเข้าไป 
                students[numberOfStudents] = student;
                this.numberOfStudents++;

                return numberOfStudents - 1;
            } else {
                return -2;
            }

        } else {
            return -1;
        }

    }

    public boolean dropStudent(RegisStudent student) {

        int Checked = 0;
        int index = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            if (student.equals(students[i])) {
                index = i;

                Checked = 1;
            }
        }

        if (Checked == 1) {
            for (int i = index; i < numberOfStudents - 1; i++) {
                students[i] = students[i + 1];
            }
            this.numberOfStudents--;
            return true;
        } else {
            return false;
        }

    }

    public RegisStudent[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public String toString() {
        String course = "----" + courseName + "----\n";
        for (RegisStudent rs : students) {
            course += rs + "\n";
        }
        return course;

    }
}
