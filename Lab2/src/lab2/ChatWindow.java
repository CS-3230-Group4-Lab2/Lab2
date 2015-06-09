/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author Clinton
 */
public class ChatWindow 
{
    protected JFrame window;
    protected JPanel background;
    protected JPanel chatPanel;
    protected JTextField chatInput;
    protected JTextArea chatDisplay;
    protected JTextPane chatUserDisplay;
    protected JScrollPane chatScroll;
    protected JScrollPane chatUserScroll;
    protected JButton submitChat;
    
    public ChatWindow()
    {
        //set up window defaults
        this.window = new JFrame();
        this.window.setTitle("CS3230 Chat Client");
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setSize(new Dimension(800,800));
        this.window.setVisible(true);
        
        this.background = new JPanel();
        this.background.setLocation(0, 0);
        this.background.setBackground(Color.red);
        this.background.setPreferredSize(new Dimension(790,790));
        this.background.setVisible(true);
        
        this.chatDisplay = new JTextArea();
        this.chatDisplay.setPreferredSize(new Dimension(390,640));
        //this.chatDisplay.
        this.chatDisplay.setEditable(false);
        this.chatDisplay.setWrapStyleWord(true);
        this.chatDisplay.setLineWrap(true);
        
        //this.chatDisplay.setText("This is a Test");
        this.chatDisplay.setVisible(true);
        
        this.chatScroll = new JScrollPane(this.chatDisplay);
        //this.chatScroll.setPreferredSize(new Dimension(400, 650));
        this.chatScroll.setLocation(0,0);
        this.chatScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        this.chatScroll.setVisible(true);
        
        //Add components to the window
        this.window.add(this.background);
        this.background.add(this.chatScroll);
        
        
        this.window.pack();
        this.chatDisplay.updateUI();
        this.chatScroll.updateUI();
        this.background.updateUI();        
        
       
        
    }
    
    public void displayChat(Group grp, int grpnum)
    {
        this.chatDisplay.append("Group #" + grpnum +"\n");
        this.chatDisplay.append(grp.getChat());
        this.chatDisplay.updateUI();
    }
    
}
