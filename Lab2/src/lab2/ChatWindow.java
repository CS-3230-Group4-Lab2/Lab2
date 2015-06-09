/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author Clinton
 */
public class ChatWindow 
{
    protected JFrame window;
    protected JPanel background;
    protected JPanel userinputPanel;
    protected JTextField chatInput;
    protected JTextArea chatDisplay;
    protected JTextArea chatUserDisplay;
    protected JScrollPane chatScroll;
    protected JScrollPane chatUserScroll;
    protected JScrollPane chatInputScroll;
    protected JButton submitChat;
    protected List<Group> groups;
    
    public ChatWindow()
    {
        groups = new ArrayList<Group>();
        //set up window defaults
        this.window = new JFrame();
        this.window.setTitle("CS3230 Chat Client");
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setSize(new Dimension(800,800));
        this.window.setVisible(true);
        
        this.background = new JPanel();
        //this.background.setLocation(0, 0);
        this.background.setBackground(Color.red);
        this.background.setLayout(new BorderLayout());
        this.background.setPreferredSize(new Dimension(790,790));
        this.background.setVisible(true);
        
        this.chatDisplay = new JTextArea();
        this.chatDisplay.setEditable(false);
        this.chatDisplay.setWrapStyleWord(true);
        this.chatDisplay.setLineWrap(true);
        this.chatDisplay.setVisible(true);
        
        this.chatScroll = new JScrollPane(this.chatDisplay);
        this.chatScroll.setPreferredSize(new Dimension(400, 650));
        //this.chatScroll.setLocation(0,0);
        this.chatScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        this.chatScroll.setVisible(true);
        
        this.chatUserDisplay = new JTextArea("Logged in Users:\n\n");
        this.chatUserDisplay.setEditable(false);
        this.chatUserDisplay.setWrapStyleWord(true);
        this.chatUserDisplay.setLineWrap(true);
        this.chatUserDisplay.setVisible(true);
        
        this.chatUserScroll = new JScrollPane(this.chatUserDisplay);
        this.chatUserScroll.setPreferredSize(new Dimension(200,650));
        this.chatUserScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        this.chatUserScroll.setVisible(true);
        
        this.userinputPanel = new JPanel();
        this.userinputPanel.setBackground(Color.BLACK);
        this.userinputPanel.setVisible(true);
        this.userinputPanel.setLayout(new BorderLayout());
        
        this.submitChat = new JButton("Run Chat");
        this.submitChat.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) 
            {
                updateChat();
            }
        });
        
        this.chatInput = new JTextField("Enter Input Here");
        this.chatInput.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //this.chatDisplay.append("\n"+ this.chatInput.getText())
                addText();
            }
        });
        
        this.chatInputScroll = new JScrollPane(this.chatInput);
        this.chatInputScroll.setPreferredSize(new Dimension(500, 50));
        this.chatInputScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        this.chatInputScroll.setVisible(true);
        
        //Add components to the window
        this.window.add(this.background);
        this.background.add(this.chatScroll);
        this.background.add(this.chatUserScroll, BorderLayout.WEST);
        this.background.add(this.userinputPanel, BorderLayout.SOUTH);
        this.userinputPanel.add(this.submitChat, BorderLayout.WEST);
        this.userinputPanel.add(this.chatInputScroll, BorderLayout.CENTER);
        
        
        this.window.pack();
        this.chatDisplay.updateUI();
        this.chatScroll.updateUI();
        this.background.updateUI();        
        
       
        
    }
    
    private void addText()
    {
        this.chatDisplay.append("\n" + this.chatInput.getText());
        this.chatInput.setText("");
    }
    
    public void displayChat(Group grp, int grpnum)
    {
        
        this.chatUserDisplay.append("Group #" + grpnum +"\n");
        this.chatUserDisplay.append(grp.getGroupMembers() + "\n");
        this.chatUserDisplay.updateUI();
        
        this.chatDisplay.append("Group #" + grpnum +"\n");
        this.chatDisplay.append(grp.getChat());
        this.chatDisplay.updateUI();
    }
    
    private void updateChat()
    {
        int groupnum = 1;
        for(Group grp : this.groups)
        {
            this.chatDisplay.append("Group #" + groupnum++ +"\n" + grp.getChat());
            this.chatDisplay.updateUI();            
        }
        
    }
    
    public void updateGroups(List<Group> grp)
    {
        groups.clear();
        groups = grp;
    }
    
}
