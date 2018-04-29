
package smartphone;

import java.util.Objects;

public class Screen {

    public static final int MAX_GRID = 24;
    private Item[] items;
    private int itemCount;
    private int gridCount;

    public Screen() {

        //สร้าง Array Items Object เท่ากับ 24
        this.items = new Item[MAX_GRID];
        
        // ค่าเริ่มต้นที่ 0
        this.itemCount = 0;
        // ค่าเริ่มต้นที่ 0
        this.gridCount = 0;

    }

    
    //รับ obj เข้ามาเป็นการเช็ค 
    public boolean addItem(Item obj) {
        
        
        // ขนาด Size เริ่มต้นที่ 1
        int size = 1;
        
        //ตรวจสอบว่ามันว่างและมันเป็นลูกของ Widget หรือไม่
        if (obj != null && obj instanceof Widget) {
            
            // กำหนดตัวแปร 
            Widget wg = (Widget) obj;
            
            //ดึงค่าจาก Wget มา
            size = wg.getnGrid();
        }
        
        // ถ้า gridCount + size น้อยกว่าและเท่ากับ 24
        if (this.gridCount + size <= 24) {
            
            //ให้เพิ่ม wget ที่รับมา
            this.items[itemCount] = obj;
            //เพิ่ม ItemsCount
            this.itemCount++;
            
            //บอกค่าของ gridCount โดยที่ค่าเดิมบวกกับ size
            this.gridCount = this.gridCount + size;
            
            //ส่งค่าเป็น True
            return true;
        } else {
            return false;
        }
    }

    
 
    

    public Item[] getItems() {
        return items;
    }

    public int getItemCount() {
        return itemCount;
    }

    public int getGridCount() {
        return gridCount;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < itemCount; i++) {
            str += items[i].toString() + ":";
        }
        return str;
    }

}
