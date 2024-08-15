/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicepolymorphism;

/**
 *
 * @author mtsguest
 */
public class SecondaryStudent extends Student {
    private String classification;
    
    public SecondaryStudent(String aFirstName, String aLastName, double aGPA, String aClassification)
    {
        super(aFirstName, aLastName, aGPA);
        this.classification = aClassification;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " and is a " + this.classification;
    }
    
}
