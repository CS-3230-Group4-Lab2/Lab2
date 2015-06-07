/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Clinton
 */
public class ChatResponses 
{
    protected String[] greetings;
    protected String[] general;
    protected String[] goodbyes;
    protected Random r = new Random();
    
    //This is the pool of responses that our students will use
    //The "greetings" is our students' FIRST phrase they'll say
    //The "general" is our students second through fourth phrases they'll say
    //The "goodbyes" is our students' last/fifth phrase they'll say
    //The idea behind making a pool of responses is to allow the computer to generate our students'
    //phrases rather than hard-coding it
    public ChatResponses()
    {
        this.greetings = new String[]{"Hello","Hi","Hola","Konichiwa","Hey all","Hello World!","For the HORDE!", "Howdy All","Howdy"};
        this.goodbyes = new String[]{"See Ya!","Laters","Hasta la Vista, BABY!","Don't let the door hit ya","goodbye","FINALLY OVER!","Commence Shut down"};
        this.general = new String[]{"This is a response!","My major is computer science","i am a robot","I like cookies","I'm 50 shades of .....",
            "My favorite animal is a panda","I am AI","you don't belong in here","I like your eyes","You smell good","my dog like chocolate",
            "Programming is fun","Java RULES!","My bit seting is 1","Garbage in is garbage out","Problem seems to be in chair not in computer",
            "First in is First out","Do you like the beach?","Did you see that last cat video!!!!"};
    }
    
    //This method generates a random number and then selects a random greeting based on the random number
    private String getGreeting()
    {
        return this.greetings[r.nextInt(this.greetings.length)];
    }
    
    //This method generates a random number and then selects a random general phrase based on the random number
    private String getGeneral()
    {
        return this.general[r.nextInt(this.general.length)];
    }
    
    //This method generates a random number and then selects a random goodbye phrase based on the random number
    private String getGoodbye()
    {
        return this.goodbyes[r.nextInt(this.goodbyes.length)];
    }
    
    /*
	This is the one public method of this class.  
	The professor Trevor Marsh asked us to have consistent
	output each time the user runs the program. 
	Clinton decided to use a Hash to get the same responses each time
	This method:
	FIRST adds a greeting to an array of responses
	NEXT adds THREE general conversation pieces
	NEXT adds a goodbye at the end of the array of responses
	After creating this array with 5 responses we create an ArrayList called Response
	We make that arraylist contain all of our responses that our method just created for us
	After creating this "response" arraylist we return it.
    */
    
    //I COULDN'T GET YOURS TO WORK SO I JUST MADE UP MY OWN BELOW
    //THIS FANCY NICE ONE IS CLINT'S

    public List<String> getResponses()
    {
        Set<String> responses = new HashSet<String>();
        List<String> response = new ArrayList<String>();
        response.add(getGreeting());

        while (responses.size() < 3)
        {
            responses.add(getGeneral());
        }
        for(String s: responses)
        {
            response.add(s);
        }
        response.add(getGoodbye());

        return response;
    }

    
    //THIS GHETTO THING IS KENNETH'S.  
    //It's less elegant but it got me from point A to point B.
    /*
    public List<String> getResponses(){
    	String a, b, c, d, e;
    	a = this.getGreeting();
    	//general responses must be unique.
    	b = this.getGeneral();
    	c = this.getGeneral();
    	//If c is the same as B it will do a while loop until it's different
    	while(c == b){
    		c = this.getGeneral();
    	}
    	d = this.getGeneral();
    	//If d is the same as b or c it will do a while loop until it's different
    	while(d == c || d == b){
    		d = this.getGeneral();
    	}
    	e = this.getGoodbye();
    	List<String> responses = Arrays.asList(a, b, c, d, e);
    	
    	return responses;
    }
    */
    
}
