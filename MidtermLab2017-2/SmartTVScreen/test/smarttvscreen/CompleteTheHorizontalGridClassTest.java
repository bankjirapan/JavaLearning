package smarttvscreen;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CompleteTheHorizontalGridClassTest {
//    Test cases for the 5 scores (HorizontalGrid)

    @Test
    public void theHorizontalGridHasNameAndMaxApp() {
        HorizontalGrid games = new HorizontalGrid("Games", 10);
        int expected = 10;
        assertEquals(expected, games.getApps().length);
    }

    @Test
    public void theHorizontalGridCanAddItems() {
        HorizontalGrid games = new HorizontalGrid("Games", 10);
        games.addApp(new SystemApp("Hub", "utility"));
        assertTrue(games.addApp(new SystemApp("Hub", "utility")));
    }

    @Test
    public void theHorizontalGridKnowWhenFull() {
        HorizontalGrid games = new HorizontalGrid("Games", 2);
        games.addApp(new SystemApp("Hub", "utility"));
        games.addApp(new SystemApp("Hub", "utility"));
        assertFalse(games.addApp(new SystemApp("Hub", "utility")));
    }

    @Test
    public void theHorizontalGridFullAndNotAddItem() {
        HorizontalGrid games = new HorizontalGrid("Games", 2);
        games.addApp(new SystemApp("Hub1", "utility"));
        games.addApp(new SystemApp("Hub2", "utility"));
        String epected = "Hub2";
        assertEquals(epected, games.getApps()[1].getName());
    }

    @Test
    public void theHorizontalGridCanAddDifferentItem() {
        HorizontalGrid games = new HorizontalGrid("Games", 10);
        boolean first = games.addApp(new SystemApp("Hub", "utility"));
        boolean second = games.addApp(new InstalledApp("Stickman Battlefields", "Djinnworks GmbHs"));
        assertTrue(first && second);
    }
}
