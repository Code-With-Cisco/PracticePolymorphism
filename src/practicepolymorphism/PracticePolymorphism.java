/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicepolymorphism;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mtsguest
 */
public class PracticePolymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        ArrayList<Student> myStudents = createArrayList();
        processStudents(myStudents);
        
        
    }
    
    public static ArrayList<Student> createArrayList() throws IOException
    {
        //1. Open the file:
        File aFile = new File("students.txt");
        Scanner inFile = new Scanner(aFile);     //Opens the file
        
        //2. Create an empty arrayList of Student objects:
        ArrayList<Student> myStudents = new ArrayList<Student>();
        
        //3. Define variables to hold data from file:
        String recType, firstName, lastName, classification, major;
        double gpa;
        int gradeLevel;
        K8Student aK8Stud;
        SecondaryStudent aSecStud;
        CollegeStudent aCollStud;
        
        while (inFile.hasNext())
        {
            recType = inFile.next();
            if (recType.equals("k"))
            {
               firstName = inFile.next();
               lastName = inFile.next();
               gpa = inFile.nextDouble();
               gradeLevel = inFile.nextInt();
               aK8Stud = new K8Student(firstName, lastName, gpa, gradeLevel);
               myStudents.add(aK8Stud);
            }
            else if (recType.equals("h"))
            {
               firstName = inFile.next();
               lastName = inFile.next();
               gpa = inFile.nextDouble();
               classification = inFile.next();
               aSecStud = new SecondaryStudent(firstName, lastName, gpa, classification);
               myStudents.add(aSecStud);
            }
            else if (recType.equals("c"))
            {
                firstName = inFile.next();
                lastName = inFile.next();
                gpa = inFile.nextDouble();
                classification = inFile.next();
                major = inFile.next();
                aCollStud = new CollegeStudent(firstName, lastName, gpa, classification, major);
                myStudents.add(aCollStud);
                
            }
            
            
        }
        
        inFile.close();
        return myStudents;
   
    }
    
    public static void processStudents(ArrayList<Student> myStuds)
    {
        for (int i = 0; i < myStuds.size(); i++)
        {
            System.out.println(myStuds.get(i).toString());
        }
    }
    
    
}
