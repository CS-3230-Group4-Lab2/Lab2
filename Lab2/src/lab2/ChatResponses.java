/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Random;

/**
 *
 * @author Clinton
 */
public class ChatResponses 
{
    private String[] greetings;
    private String[] general;
    private String[] goodbyes;
    private Random r = new Random();
    
    public ChatResponses()
    {
        this.greetings = new String[]{"Hello","Hi","Hola","Konichiwa","Hey all","Hello World!","For the HORDE!", "Howdy All","Howdy"};
        this.goodbyes = new String[]{"See Ya!","Laters","Hasta la Vista, BABY!","Don't let the door hit ya","goodbye","FINALLY OVER!","Commence Shut down"};
        this.general = new String[]{"This is a response!","My major is computer science","i am a robot","I like cookies","I'm 50 shades of .....",
            "My favorite animal is a panda","I am AI","you don't belong in here","I like your eyes","You smell good","my dog like chocolate",
            "Programming is fun","Java RULES!","My bit seting is 1","Garbage in is garbage out","Problem seems to be in chair not in computer",
            "First in is First out","Do you like the beach?","Did you see that last cat video!!!!"};
    }
    
    public String getGreeting()
    {
        return this.greetings[r.nextInt(this.greetings.length)];
    }
    
    public String getGeneral()
    {
        return this.general[r.nextInt(this.general.length)];
    }
    
    public String getGoodbye()
    {
        return this.goodbyes[r.nextInt(this.goodbyes.length)];
    }
    
}