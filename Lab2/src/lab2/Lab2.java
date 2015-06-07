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
public class Lab2 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
    	System.out.println("This is a test");
    	StudentList test = new StudentList();
        List<Group> studentGroups = new ArrayList<Group>();
        studentGroups = test.getGroups();
        System.out.println(studentGroups.size());
        
        int groupNumber = 1;
        for (Group grp : studentGroups)
        {
            System.out.println("Group #" + groupNumber);
            System.out.println(grp.getChat());
            System.out.println();
            groupNumber++;
        }
       
    }
    
}
