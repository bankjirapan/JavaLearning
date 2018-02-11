package dependency;

/**
 *
 * @author bankcom
 */


public class SITINFO {

    private int gard;
    private char GardShow;
    private long stdID;
    private SITAddress SITAddr;

    public SITINFO() {
    }

    public SITINFO(int gard, long stdID,SITAddress SITAddr) {
        this.gard = gard;
        this.stdID = stdID;
        this.SITAddr = SITAddr;
        
        if(gard >= 80){
            this.GardShow = 'A';
        } else if(gard >= 70){
             this.GardShow = 'B';
        } else if(gard >= 60){
             this.GardShow = 'C';
        } else if(gard >= 50){
             this.GardShow = 'D';
        } else {
            this.GardShow = 'F';
        }
      

    }

    public int getGard() {
        return gard;
    }

    public void setGard(int gard) {
        this.gard = gard;
    }

    public long getStdID() {
        return stdID;
    }

    public void setStdID(long stdID) {
        this.stdID = stdID;
    }

    public SITAddress getSITAddr() {
        return SITAddr;
    }

    public void setSITAddr(SITAddress SITAddr) {
        this.SITAddr = SITAddr;
    }

    public char getGardShow() {
        return GardShow;
    }

    public void setGardShow(char GardShow) {
        this.GardShow = GardShow;
    }
    

    @Override
    public String toString() {
        return "SITINFO " + "gard=" + gard + ", stdID=" + stdID + ", SITAddr=" + SITAddr +"\n ได้เกรด "+GardShow;
    }
    

   
    

}
