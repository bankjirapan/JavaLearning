//Agregation Subject
package student.model;

/**
 *
 * @author bankcom
 */
public class Address {
    
    private String HouseNo;
    private String addr;
    private String street;
    private String province;
    private String zipCode;

    public Address() {
    }

    public Address(String HouseNo, String addr, String street, String province, String zipCode) {
        this.HouseNo = HouseNo;
        this.addr = addr;
        this.street = street;
        this.province = province;
        this.zipCode = zipCode;
    }

    public String getHouseNo() {
        return HouseNo;
    }

    public void setHouseNo(String HouseNo) {
        this.HouseNo = HouseNo;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
         return "Address " + "HouseNo=" + HouseNo + ", addr=" + addr + ", street=" + street + ", province=" + province + ", zipCode=" + zipCode;
    }
    
    
    
    
    
    
    
}
