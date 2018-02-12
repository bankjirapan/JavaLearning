
package studentgrade.model;

public class Student {
    
    
    private long stdID;
    private String stdName;

    public Student(){
        
    }

    public Student(long stdID, String stdName) {
        this.stdID = stdID;
        this.stdName = stdName;
    }

    public long getStdID() {
        return stdID;
    }

    public void setStdID(long stdID) {
        this.stdID = stdID;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    @Override
    public String toString() {
        return "Student{" + "stdID=" + stdID + ", stdName=" + stdName + '}';
    }
    
    public String showPortfolio(){
        return toString();
    }
    
    
    
    
    
    
    
}
