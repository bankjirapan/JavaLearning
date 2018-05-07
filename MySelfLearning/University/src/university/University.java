/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

import university.model.KinderGartenStudent;
import university.model.Student;
import university.model.UniversityStudent;

/**
 *
 * @author INT105
 */
public class University {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student child1 = new KinderGartenStudent(10000, 50000, "Deb", 60123, "DebKid1",
                25000);
        Student child2 = new UniversityStudent(10000, true, true, 60124,
                "DebKid2", 50000);

        //สามารถใช้แบบนี้ก็ได้นะ
        KinderGartenStudent child3 = new KinderGartenStudent(10000, 50000, "Deb", 60123, "DebKid1",
                25000);
        UniversityStudent child4 = new UniversityStudent(10000, true, true, 60124,
                "DebKid2", 50000);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println();
        System.out.println("Child1 Expense: " + child1.expensePerSemester());
        System.out.println("Child2 Expense: " + child2.expensePerSemester());

    }

}
