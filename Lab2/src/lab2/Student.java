//commented this out for my computer
package lab2;

import java.util.ArrayList;
import java.util.List;

public class Student 
{
    protected String firstName;
    protected String lastName;
    protected int score;
    protected List<String> responses;
    
    //This constructor creates a student with no name, a score of 0, and randomly generated responses
    public Student()
    {
        this.firstName = " ";
        this.lastName = " ";
        this.score = 0;
        this.responses = new ArrayList<String>();
    }
    
    //This constructor allows us to create a student with a name, a score, and generated chat responses
    public Student(String first, String last, int s, ChatResponses chat)
    {
        this.firstName = first;
        this.lastName = last;
        this.score = s;
        this.responses = new ArrayList<String>();
        populateResponses(chat);
        
    }
    
    //This appears to create responses for our student
    private void populateResponses(ChatResponses chats)
    {
        responses = chats.getResponses();
    }

    public String getName(){
    	return (this.firstName + " " + this.lastName);
    }
    
    //This combines the student's first and last names together and returns them
    public String getStudentName()
    {
        return (this.firstName + " " + this.lastName);
    }
    
}
