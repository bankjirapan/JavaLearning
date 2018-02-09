//Container
package student.model;

/**
 *
 * @author bankcom
 */
public class Student {
    
        private long stdID;
        private String stdName;
        
        //ผูก Aggregation container หรือ Link 
        //Student has an address;
        private Address stdAddress;
        
    
}
