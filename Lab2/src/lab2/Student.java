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
    private String firstName;
    private String lastName;
    private int score;
    private Student partner;
    private List<String> responses;
    
    
    public Student()
    {
        this.firstName = " ";
        this.lastName = " ";
        this.score = 0;
        this.partner = new Student();
        this.responses = new ArrayList<String>();
    }
    
    public Student(String first, String last, int s, ChatResponses chat)
    {
        this.firstName = first;
        this.lastName = last;
        this.score = s;
        this.partner = new Student();
        this.responses = new ArrayList<String>();
        populateResponses(chat);
        
    }
    
    public void assignPartner(Student stud)
    {
        this.partner = stud;
    }
    
    private void populateResponses(ChatResponses chats)
    {
        this.responses.add(chats.getGreeting());
        for(int i =0; i<3; i++)
        {
            this.responses.add(chats.getGeneral());
        }
        this.responses.add(chats.getGoodbye());
    }
    
}
