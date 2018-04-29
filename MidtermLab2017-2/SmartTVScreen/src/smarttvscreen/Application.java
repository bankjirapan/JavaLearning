/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttvscreen;

/**
 *
 * @author bankcom
 */
public class Application {
    
    private String name;
    private String images;
    private String description;
    private String company;

    public Application() {
    }
    
    

    public Application(String name) {
        this.name = name;
    }

    public Application(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Application{" + "name=" + name + ", images=" + images + ", description=" + description + ", company=" + company + '}';
    }
    
    
    
    
    
    
    
}
