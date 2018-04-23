package smarttvscreen;

public class HorizontalGrid {

    private String name;
// hint 1 
    private int focusIdx, insertedApps , numOfApps;

    public HorizontalGrid(String name, int i) {
// hint 2 
        this.name = name;
        this.numOfApps = i;
    }

// hint 3 addApp

    public void setFocusIdx(Cursor cursor) {
        
        if(cursor.getColumn()>=insertedApps){
            focusIdx=insertedApps-1;
            cursor.setColumn(focusIdx);
        }else{
            focusIdx=cursor.getColumn();
        }
    }
    public void clearFocusIdx() {
        focusIdx=-1;
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
