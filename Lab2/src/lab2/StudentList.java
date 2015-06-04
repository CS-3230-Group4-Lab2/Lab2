/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.*;
import java.util.ArrayList;
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
    protected List<Group> groups;
    
    public StudentList()
    {
        this.roster = new String[]{"Kenneth Adair","Anthony Alder","Moselle Bair","Mathew Brewer","Michael Brown","Aaron Calder","Brett Carter","Tyler Cazier",
            "Jared Elzinga","Clinton Fowler","Andrew Gray","Christopher Strickland","Justin Walker"};

        this.groups = new ArrayList<Group>();
        
        Set<String> studentRoster = new HashSet<String>(Arrays.asList(this.roster));
        
        
        for (String name: studentRoster)
        {
            String[] splitname = name.split(" ");
            Student newstudent = new Student(splitname[0], splitname[1], 0, chats);
            students.add(newstudent);
        }

        for(Student stud: this.students)
        {
            if (stud.getName() == "Aaron Calder" || stud.getName() == "Jared Elzinga")
            {
                this.groups.get(0).addStudentToGroup(stud);
                continue;
            }
            if (stud.getName() == "Justin Walker" || stud.getName() == "Michael Brown")
            {
                this.groups.get(1).addStudentToGroup(stud);
                continue;
            }
            if (stud.getName() == "Anthony Alder" || stud.getName() == "Christopher Strickland")
            {
                this.groups.get(2).addStudentToGroup(stud);
                continue;
            }
            if (stud.getName() == "Clinton Fowler" || stud.getName() == "Kenneth Adair")
            {
                this.groups.get(3).addStudentToGroup(stud);
                continue;
            }
            if (stud.getName() == "Mathew Brewer" || stud.getName() == "Tyler Cazier")
            {
                this.groups.get(4).addStudentToGroup(stud);
                continue;
            }
            if (stud.getName() == "Andrew Gray" || stud.getName() == "Brett Carter" || stud.getName() == "Moselle Bair"
            {
                this.groups.get(5).addStudentToGroup(stud);
                continue;
            }
        }
    }
    
    public List<Group> getGroups()
    {
        return this.groups;
    }
    
}
