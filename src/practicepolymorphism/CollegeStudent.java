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
public class CollegeStudent extends SecondaryStudent {
    private String major;
    
    public CollegeStudent(String aFirstName, String aLastName, double aGPA, String aClassification, String aMajor)
    {
        super(aFirstName, aLastName, aGPA, aClassification);
        this.major = aMajor;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    public String toString()
    {
        return super.toString() + " majoring in " + major;
    }
    
    
    
}
