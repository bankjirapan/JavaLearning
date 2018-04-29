
package smarttvscreen;

public class HorizontalGrid {

    private String name;
    private Application[] apps;
// hint 1 
    private int focusIdx, insertedApps, numOfApps;

    public HorizontalGrid(String name, int i) {
// hint 2 

        //สร้าง Array Object ที่มาขนาด i 
        apps = new Application[i];
        this.name = name;
        this.numOfApps = i;
        
        //เริ่มต้นค่าเป็น 0;
        this.insertedApps = 0;
    }

// hint 3 addApp
    
    //Method addApp รับพารามิเตอร์ app
    public boolean addApp(Application app) {

        //ถ้า insertedApps น้อยกว่า Array Object apps
        if (insertedApps < apps.length) {

            //วนลูปหาช่องที่สว่าง
            for (int i = 0; i < apps.length; i++) {
                //เอาข้อมูลเพิ่มโลดดด
                apps[insertedApps] = app;

            }
            
            // เพิ่มค่า Return ปกติ
            this.insertedApps++;
            return true;

        }
        return false;

    }

    
    // Return เป็น Object
    public Application[] getApps() {
        return apps;
    }

    public void setFocusIdx(Cursor cursor) {

        if (cursor.getColumn() >= insertedApps) {
            focusIdx = insertedApps - 1;
            cursor.setColumn(focusIdx);
        } else {
            focusIdx = cursor.getColumn();
        }
    }

    public void clearFocusIdx() {
        focusIdx = -1;
    }

    public int getNumOfApps() {
        return numOfApps;
    }

    public void setNumOfApps(int numOfApps) {
        this.numOfApps = numOfApps;
    }

    @Override
    public String toString() {
        String str = "[ " + name + " ]\n";
        for (int i = 0; i < insertedApps; i++) {
            if (i == focusIdx) {
                str += "  ((" + apps[i].getName() + "))";
            } else {
                str += "  " + apps[i].getName();
            }
        }
        return str;
    }

}
