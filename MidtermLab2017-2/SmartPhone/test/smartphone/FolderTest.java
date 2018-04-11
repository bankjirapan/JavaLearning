/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartphone;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Praisan.pad
 */
public class FolderTest {

    @Test
    public void cannotAddSameApp() {
        Folder folder = new Folder("Utils");
        folder.addItem(new Application("Maps", "OO"));
        assertFalse(folder.addItem(new Application("Maps", "OO")));
    }

    @Test
    public void canAdd4Apps() {
        Folder folder = new Folder("Utils");
        folder.addItem(new Application("Maps1", "OO"));
        folder.addItem(new Application("Maps2", "OO"));
        folder.addItem(new Application("Maps3", "OO"));
        assertTrue(folder.addItem(new Application("Maps4", "OO")));
    }

    @Test
    public void cannotAddMoreThan4Apps() {
        Folder folder = new Folder("Utils");
        folder.addItem(new Application("Maps1", "OO"));
        folder.addItem(new Application("Maps2", "OO"));
        folder.addItem(new Application("Maps3", "OO"));
        folder.addItem(new Application("Maps4", "OO"));
        assertFalse(folder.addItem(new Application("Maps5", "OO")));
    }

}
