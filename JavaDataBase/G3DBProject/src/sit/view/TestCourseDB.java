
package sit.view;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import sit.controller.CourseController;
import sit.model.Course;
public class TestCourseDB {
    public static void main(String[] args) {
        try{
            CourseController courseCtrl=
                    new CourseController("sit", "sit");
            courseCtrl.executeSQLFromUser("select * from course where courseId='GEN111'");
            courseCtrl.executeSQLFromUser("update course set courseName='Strong Man' where courseId='GEN111'");
        //    courseCtrl.insertFromFile("courseList.txt");
        //ArrayList<Course> cList=courseCtrl.selectCourses();
           /* for (Course c: cList) {
                System.out.println(c);                
            }*/
          /*  for(int i=0;i<cList.size();i++){
                System.out.println(cList.get(i));
                String cId=(cList.get(i)).getCourseId();
                if(cId.equalsIgnoreCase("GEN111"))
                    cList.get(i).setCourseName("Strong Man");
                
           }*/
         courseCtrl.closeCourseConnection();
        }
        catch(ClassNotFoundException cnf){
            System.out.println(cnf);    
        }
        catch(SQLException cnf){
            System.out.println(cnf);    
        }
      /*  catch(FileNotFoundException fnf){
            System.out.println(fnf);  
        }*/
    }
}
//  courseCtrl.dropCourseTable();
          //  courseCtrl.createCourseTable();            
           /* Course c1=new Course("INT105", "Computer Programming II");
            int insertedRec=courseCtrl.insertCourse(c1);
            System.out.println(insertedRec+"Inserted Record");*/