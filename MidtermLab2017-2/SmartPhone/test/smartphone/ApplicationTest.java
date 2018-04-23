package smartphone;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ApplicationTest {
    
    @Test
    public void compareDifferentObjectMustReturnFalse(){
        Application app=new Application("Map","OO");
        assertFalse(app.equals(new Application("Map2","OOO")));
    }
    @Test
    public void compareSameObjectMustReturnTrue(){
        Application app=new Application("Map","OO");
        assertTrue(app.equals(new Application("Map","OO")));
    }
}
