/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgrade.model;

/**
 *
 * @author INT105
 */
public class UnderGraduatedStudent extends Student{
    
    private String project;

    
    
    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "UnderGraduatedStudent{" + "project=" + project + '}';
    }
    
    
    
}
