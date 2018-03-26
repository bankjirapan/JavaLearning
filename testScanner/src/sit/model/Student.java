/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.model;

/**
 *
 * @author INT105
 */
public class Student {
    
    private int stdID;
    private String stdFirstName;
    private String stdLastName;

    public Student() {
    }

    public Student(int stdID, String stdFirstName, String stdLastName) {
        this.stdID = stdID;
        this.stdFirstName = stdFirstName;
        this.stdLastName = stdLastName;
    }

    public int getStdID() {
        return stdID;
    }

    public void setStdID(int stdID) {
        this.stdID = stdID;
    }

    public String getStdFirstName() {
        return stdFirstName;
    }

    public void setStdFirstName(String stdFirstName) {
        this.stdFirstName = stdFirstName;
    }

    public String getStdLastName() {
        return stdLastName;
    }

    public void setStdLastName(String stdLastName) {
        this.stdLastName = stdLastName;
    }

    @Override
    public String toString() {
        return "Student{" + "stdID=" + stdID + ", stdFirstName=" + stdFirstName + ", stdLastName=" + stdLastName + '}';
    }
    
    
    
}
