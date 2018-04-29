<<<<<<< HEAD
package smartphone;

public class Folder extends Item {

    private static int maxApp = 4;
    
    //Load Class Dependency ชื่แว่า apps
    private Application[] apps;
    private int appCount;

    public Folder(String name) {

        super(name);
        
        //ตั้งค่า apps โดยมีขนาด Array เท่่กับ MaxApp;
        this.apps = new Application[maxApp];
        
        //ค่าเริ่มต้นของ AppCount
        appCount = 0;

    }

    
    //Method Return ค่าเป็น True
    public boolean addItem(Application app) {

        //ถ้า Appcount ยังน้อยกว่า Maxapp 
        if (appCount < maxApp) {

            //วนลูปที่ AppCount
            for (int i = 0; i < appCount; i++) {

                //ถ้ามันมีข้อมูลอยู่แล้วนั่นคือ Check เท่ากับ app ที่รับเข้ามา
                if (apps[i].equals(app)) {
                    
                    //รีเทิน false;
                    return false;
                }
            }
            //แสดงว่าช่องนั้นมันว่างให้เอาบอกว่า พารามิเตอร์ด้านบนยังมีช่อง appcount เหลืออยู่ให้นำข้อมูล app ไปใส่
            this.apps[appCount] = app;
            //เพิ่มค่าของ appCpunt กรณีเพิ่มข้อมูลเสร็จแล้ว
            this.appCount++;
            
            //Return ค่า
            return true;

            // ถ้ามันมากกว่าแล้ว Return false
        } else {
            
            return false;
        }

    }

    @Override
    public String toString() {
        String str = this.getName() + " - ";
        for (int i = 0; i < appCount; i++) {
            str += apps[i].getName() + ", ";
        }
        return str;
    }

}
=======
package smartphone;

public class Folder extends Item {

    private static int maxApp = 4;
    private Application[] apps;
    private int appCount;

    public Folder(String name) {

        super(name);
        this.apps = new Application[maxApp];
        appCount = 0;

    }

    public boolean addItem(Application app) {

        if (appCount < maxApp) {

            for (int i = 0; i < appCount; i++) {

                if (apps[i].equals(app)) {
                    return false;
                }

            }
            this.apps[appCount] = app;
            this.appCount++;
            return true;

        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        String str = this.getName() + " - ";
        for (int i = 0; i < appCount; i++) {
            str += apps[i].getName() + ", ";
        }
        return str;
    }

}
>>>>>>> d55087d320aade705a735a719d7db7e95b19bf96
