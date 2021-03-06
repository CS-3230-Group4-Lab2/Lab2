/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Clinton
 */
public class Group
{
    protected List<Student> students;

    public Group()
    {
        this.students = new ArrayList<Student>();
    }

    public void addStudentToGroup(Student student)
    {
        if (this.students.size() < 1)
        {
            this.students.add(student);
            return;
        }
        for(Student studA: this.students)
        {
            if(studA.getName().equals(student.getName()))
            {
                return;
            }
        }
        this.students.add(student);
    }
    
    //Get a string that contains each students name on a new line
    public String getGroupMembers()
    {
        String groupMembers = "";
        for (Student stud : this.students)
        {
            groupMembers += stud.getName();
            groupMembers += "\n";
        }
        return groupMembers;
    }
    
    //Get a string that has all responses from each student on a new line
    public String getChat()
    {
        String chatText = "";

        for(int i = 0; i < 5; i++)
        {
            for(Student student: this.students)
            {
                chatText += student.getName();
                chatText += ": ";
                chatText += student.responses.get(i);
                chatText += "\n\n";
            }
        }

        return chatText;
    }
}

