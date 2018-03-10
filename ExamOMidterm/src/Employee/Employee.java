/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 *
 * @author bankcom
 */
public class Employee {
    
    
    private int employeeId;
    private String name;
    private double Saraly;
    
    
    public Employee(){
        
    }
    
    public Employee(int ElyId,String name,double saraly){
        this.employeeId = ElyId;
        this.name = name;
        this.Saraly = saraly;
    }
    


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaraly() {
        return Saraly;
    }

    public void setSaraly(double Saraly) {
        this.Saraly = Saraly;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeId=" + employeeId + ", name=" + name + ", Saraly=" + Saraly + '}';
    }
    
    
    
    
    
}
