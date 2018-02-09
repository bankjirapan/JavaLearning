//Container
package student.model;

/**
 *
 * @author bankcom
 */
public class Student {

    private long stdID;

    //String ก็เป็น Aggregation เหมือนกัน
    private String stdName;

    //ผูก Aggregation container หรือ Link 
    //Student has an address;
    private Address stdAddress;

    //สังเกตุตรงที่ Address มันคือการรับค่าเข้ามาให้ Addtributed ของ Class นี้
    /* โยนมาค่าเดียวคือโยน Memory address */
    public Student(long stdID, String stdName, Address stdAddress) {
        this.stdID = stdID;
        this.stdName = stdName;
        this.stdAddress = stdAddress;
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

    public Address getStdAddress() {
        return stdAddress;
    }

    public void setStdAddress(Address stdAddress) {
        this.stdAddress = stdAddress;
    }

    @Override
    public String toString() {
        return "Student{" + "stdID=" + stdID + ", stdName=" + stdName + ", stdAddress=" + stdAddress + '}';
    }
    
    
    

}
