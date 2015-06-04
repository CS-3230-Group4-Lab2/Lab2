/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Clinton
 */
public class Student 
{
    protected String firstName;
    protected String lastName;
    protected int score;
    protected List<String> responses;
    
    
    public Student()
    {
        this.firstName = " ";
        this.lastName = " ";
        this.score = 0;
        this.responses = new ArrayList<String>();
    }
    
    public Student(String first, String last, int s, ChatResponses chat)
    {
        this.firstName = first;
        this.lastName = last;
        this.score = s;
        this.responses = new ArrayList<String>();
        populateResponses(chat);
        
    }
    
    private void populateResponses(ChatResponses chats)
    {
        responses = chats.getResponses();
    }

    public String getStudentName()
    {
        return (this.firstName + " " + this.lastName)
    }
    
}
