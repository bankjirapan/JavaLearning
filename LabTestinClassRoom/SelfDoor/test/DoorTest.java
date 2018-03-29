/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import int105.model.Card;
import int105.model.ElectronicDoor;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tisanai.Cha
 */
public class DoorTest {

    @Test
    public void lockDoor() {
        ElectronicDoor elecDoor = new ElectronicDoor(21, "AABNchaa", "TOCHIBANA");
        Card card = new Card(1, "AABNcasash", "Taey");
        elecDoor.unlock(card);
        elecDoor.lock();
        assertFalse(elecDoor.isStatus());
    }

    @Test
    public void unlockDoor() {
        ElectronicDoor elecDoor = new ElectronicDoor(1, "AABNch", "TOCHIBANA");
        Card card = new Card(1, "AABNch", "Taey");
        elecDoor.unlock(card);

    }

    @Test
    public void wrongKeyUnlockDoor() {
        ElectronicDoor elecDoor = new ElectronicDoor(1, "AABNch", "TOCHIBANA");
        Card card = new Card(2, "Zsvsdax", "Taey");
        elecDoor.unlock(card);
        assertFalse(elecDoor.isStatus());
    }

}
