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
        
        Set<String> studentRoster = new HashSet<String>(Arrays.asList(this.roster));
        
        //Getting an error at "students.add(newstudent);
        for (String name: studentRoster)
        {
            String[] splitname = name.split(" ");
            Student newstudent = new Student(splitname[0], splitname[1], 0, chats);
            students.add(newstudent);
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
            if (stud.getName() == "Andrew Gray" || stud.getName() == "Brett Carter" || stud.getName() == "Moselle Bair")
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
