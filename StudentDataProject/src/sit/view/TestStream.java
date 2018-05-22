/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author INT105
 */
public class TestStream {

    public static void main(String[] args) {
        FileInputStream fis = null;
        DataInputStream dis = null;
        try {
            fis = new FileInputStream("student.bank");
            dis = new DataInputStream(fis);

            while (true) {
                int stdId = dis.readInt();
                String stdFirstName = dis.readUTF();
                String stdLastName = dis.readUTF();

                System.out.println(stdId + " " + stdFirstName + " " + stdLastName);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);

        } catch (EOFException eof) {

            try {
                dis.close();
            } catch (IOException io) {
                System.out.println(io);
            }
           
        } catch (IOException io) {
            System.out.println(io);
        }

    }

}
