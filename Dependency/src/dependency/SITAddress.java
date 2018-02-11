
package dependency;

/**
 *
 * @author bankcom
 */
public class SITAddress {
    
    private String HouseNo;
    private String Street;
    private String Distract;
    private String Province;
    private String ZipCode;

    public SITAddress() {
    }

    public SITAddress(String HouseNo, String Street, String Distract, String Province, String ZipCode) {
        this.HouseNo = HouseNo;
        this.Street = Street;
        this.Distract = Distract;
        this.Province = Province;
        this.ZipCode = ZipCode;
    }

    public String getHouseNo() {
        return HouseNo;
    }

    public void setHouseNo(String HouseNo) {
        this.HouseNo = HouseNo;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getDistract() {
        return Distract;
    }

    public void setDistract(String Distract) {
        this.Distract = Distract;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String Province) {
        this.Province = Province;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }

    @Override
    public String toString() {
        return "SITAddress{" + "HouseNo=" + HouseNo + ", Street=" + Street + ", Distract=" + Distract + ", Province=" + Province + ", ZipCode=" + ZipCode + '}';
    }

 
  
    
    
   
            
    
}
