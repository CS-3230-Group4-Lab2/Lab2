/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Clinton
 */
public class StudentList 
{
    protected ChatResponses chats = new ChatResponses();
    protected List<Student> students;
    protected String[] roster;
    
    public StudentList()
    {
        this.roster = new String[]{"Kenneth Adair","Anthony Alder","Moselle Bair","Mathew Brewer","Michael Brown","Aaron Calder","Brett Carter","Tyler Cazier",
            "Jared Elzinga","Clinton Fowler","Andrew Gray","Trever Marsh","Christopher Strickland","Ted Cowan","Justin Walker"};
        
        Set<String> studentRoster = new HashSet<String>(Arrays.asList(this.roster));
        
        
        for (String name: studentRoster)
        {
            String[] splitname = name.split(" ");
            Student newstudent = new Student(splitname[0], splitname[1], 0, chats);
            students.add(newstudent);
        }
    }
    
    /**
     * function to build the groups
     * 
     * 
    */
    
}
