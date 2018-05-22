package icomcaremaster;

import icomcaremaster.controller.MainController;
import icomcaremaster.view.LoginView;
import java.sql.SQLException;


/**
 *
 * @author bankcom
 */
public class IComCareMaster {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
       
        
        MainController main = new MainController();
        
        if(main.Status() != 1){
            System.out.println("Error");
        } else {
            System.out.println("OK");
        }
         // LoginView login = new LoginView();
         
         
         
    }

}
