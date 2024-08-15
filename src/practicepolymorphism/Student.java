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
public abstract class Student {
    
    private String firstName;
    private String lastName;
    private double gpa;
    
    public Student(String aFirstName, String aLastName, double aGPA)
    {
        this.firstName = aFirstName;
        this.lastName = aLastName;
        this.gpa = aGPA;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    public String toString()
    {
        return "Student " + firstName + " " + lastName + " has a gpa of " + gpa;
    }
    
}
