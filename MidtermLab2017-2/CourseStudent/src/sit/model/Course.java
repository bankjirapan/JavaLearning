
package sit.model;

public class Course {

    private String courseName;
    private RegisStudent[] students;

    private int numberOfStudents;

    public Course(String courseName, int numOfStudentCanRegis) {

        students = new RegisStudent[numOfStudentCanRegis];
        this.courseName = courseName;

    }

    public int addStudent(RegisStudent student) {

        //ตั้งค่า Defualt
        int Check = 0;

        //วนลูปน้อยกว่าจำนวนนักศึกษา
        for (int i = 0; i < numberOfStudents; i++) {

            //เช็คว่าซ้ำกันหรือไม่
            if (student.equals(students[i])) {
                //ถ้ามันเท่ากัน ตั้งค่า Check เป็น 1
                Check = 1;
            } /// จบส่วนของ if

        } // จบส่วนของ for

        //กรณีที่ไม่ข้อมูลไม่ซ้ำกัน
        if (Check == 0) {

            //เช็คอีกว่ามันน้อยกว่าหรือไม่เกินจำนวน Array หรือไม่
            if (numberOfStudents < students.length) {
                //เพิ่มเข้าไปใน Array ช่องที่ numOfstudent
                students[numberOfStudents] = student;

                //บวกค่าเพิ่ม
                this.numberOfStudents++;

                //Return ค่ากลับ
                return numberOfStudents - 1;
            } else {
                //ถ้ามันเต็มแล้ว Return -2
                return -2;
            }
        }

        //ไม่มี Stamanemt Return -1
        return -1;
    }

    public boolean dropStudent(RegisStudent student) {

        //ประกาศตัวแปร Check กับ index
        int index = 0;
        int Check = 0;

        //วนลูปหาข้อมูลมีหรือไม่
        for (int i = 0; i < numberOfStudents; i++) {

            //ถ้ามีข้อมูล
            if (student.equals(students[i])) {
                //ตั้ง index เป็น i
                index = i;
                //สถานะเป็น 1;
                Check = 1;

            }
        }
        //ถ้ามันมีข้อมูล
        if (Check == 1) {
            //วนลูปหาช่องที่มี่เริ่มตั้งแต่ที่เจอ และน้อยกว่า numofStudent
            for (int i = index; i < numberOfStudents - 1; i++) {
                //เพิ่มไป 1
                students[i] = students[i + 1];

            }
            //ลบจำนวนออกไป
            this.numberOfStudents--;

            //return  
            return true;

        }

        return false;

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
