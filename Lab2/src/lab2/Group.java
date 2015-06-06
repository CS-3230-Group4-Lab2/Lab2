/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package lab2;

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
            if(studA.getName() == student.getName())
            {
                return;
            }
        }
        this.students.add(student);
    }

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
                chatText += "\n";
            }
        }

        return chatText;
    }
}

