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
public class K8Student extends Student {
    private int gradeLevel;
    
    public K8Student(String aFirstName, String aLastName, double aGPA, int aGradeLevel)
    {
        super(aFirstName, aLastName, aGPA);
        this.gradeLevel = aGradeLevel;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " grade level = " + this.gradeLevel;
    }
}
