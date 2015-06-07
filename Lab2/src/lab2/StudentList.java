package lab2;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentList 
{
    //The student's chat responses
    protected ChatResponses chats = new ChatResponses();
    protected List<Student> students;
    protected String[] roster;
    protected List<Group> groups;
    
    public StudentList()
    {
	//The students' names in alphabetical order
        this.roster = new String[]{"Kenneth Adair","Anthony Alder","Moselle Bair","Mathew Brewer","Michael Brown","Aaron Calder","Brett Carter","Tyler Cazier",
            "Jared Elzinga","Clinton Fowler","Andrew Gray","Christopher Strickland","Justin Walker"};

        this.groups = new ArrayList<Group>();
        this.students = new ArrayList<Student>();
        
        Set<String> studentRoster = new HashSet<String>(Arrays.asList(this.roster));
        
        for (String name: studentRoster)
        {
            String[] splitname = name.split(" ");
            Student newstudent = new Student(splitname[0], splitname[1], 0, chats);
            students.add(newstudent);
        }
        
        for(int i = 0; i < 6; i++)
        {
            this.groups.add(new Group());
        }
        
	/*
	This FOR loop appears to manually create the groups that match the class roster
	It's a bunch of IF statements
	It appears that after we have generated each of the students in the class
	we create the 6 groups and then add the students to the groups they correspond to
	*****It may be worth noting that some students have dropped the class since we created this list
	*****There are only 11 students right now with group 6(5 in our project).
		Brett Carter in group 6 appears to have dissapeared
		Anthony Alder in Group 3 appears to have dissapeared
	As far as I can tell this loop creates an array of lists and then matches the students with the
	group they belong with.
	*/
        for(Student stud: this.students)
        {            
            if (stud.getName().equals("Aaron Calder") || stud.getName().equals("Jared Elzinga"))
            {
                this.groups.get(0).addStudentToGroup(stud);
                continue;
            }
            if (stud.getName().equals("Justin Walker") || stud.getName().equals("Michael Brown"))
            {
                this.groups.get(1).addStudentToGroup(stud);
                continue;
            }
            if (stud.getName().equals("Anthony Alder") || stud.getName().equals("Christopher Strickland"))
            {
                this.groups.get(2).addStudentToGroup(stud);
                continue;
            }
            if (stud.getName().equals("Clinton Fowler") || stud.getName().equals("Kenneth Adair"))
            {
                this.groups.get(3).addStudentToGroup(stud);
                continue;
            }
            if (stud.getName().equals("Mathew Brewer") || stud.getName().equals("Tyler Cazier"))
            {
                this.groups.get(4).addStudentToGroup(stud);
                continue;
            }
            if (stud.getName().equals("Andrew Gray") || stud.getName().equals("Brett Carter") || stud.getName().equals("Moselle Bair"))
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
