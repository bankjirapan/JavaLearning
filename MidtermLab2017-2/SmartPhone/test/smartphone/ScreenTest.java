
package smartphone;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ScreenTest {
      
    @Test
    public void addItemToScreen(){
        Screen screen=new Screen();
        Application app=new Application("Maps","OO");
        screen.addItem(app);
        assertTrue(app.getName().equals(screen.getItems()[0].getName()));
    }
    @Test
    public void cannAdd24Boxes(){
        Screen screen=new Screen();
        Application app=new Application("Maps","OO");
        screen.addItem(app);screen.addItem(app);screen.addItem(app);
        screen.addItem(app);screen.addItem(app);screen.addItem(app);
        screen.addItem(app);screen.addItem(app);screen.addItem(app);
        screen.addItem(app);screen.addItem(app);screen.addItem(app);
        
        screen.addItem(app);screen.addItem(app);screen.addItem(app);
        screen.addItem(app);screen.addItem(app);screen.addItem(app);
        screen.addItem(app);screen.addItem(app);screen.addItem(app);
        screen.addItem(app);screen.addItem(app);      
        assertTrue(screen.addItem(app));        
    }
    @Test
    public void cannAddWidgetUpTo24Boxes(){
        Screen screen=new Screen();
        Widget app=new Widget("Calendar",6);
        screen.addItem(app);
        screen.addItem(app);
        screen.addItem(app);   
        assertTrue(screen.addItem(app));        
    }
    
    @Test
    public void cannotAddMoreThan24Boxes(){
        Screen screen=new Screen();
        Widget app=new Widget("Calendar",6);
        screen.addItem(new Widget("Clock",4));
        screen.addItem(app);
        screen.addItem(app);
        screen.addItem(app);   
        assertFalse(screen.addItem(app));        
    }

    @Test
    public void canAddDifferentItem(){
        boolean result=true;
        Screen screen=new Screen();
        result &= screen.addItem(new Application("Maps","OO"));
        result &= screen.addItem(new Widget("Calendar",6));
        result &= screen.addItem(new Folder("Utils"));
        assertTrue(result);
        
    }
    
}
