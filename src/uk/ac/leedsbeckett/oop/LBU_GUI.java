package uk.ac.leedsbeckett.oop;

import javax.swing.*;
import java.awt.*;

public class LBU_GUI extends LBUGraphics
{
    public LBU_GUI()
    {
        //LBUGraphics Turtle = new LBUGraphics();
        JFrame MainFrame = new JFrame();		//create a frame to display the turtle panel on
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Make sure the app exits when closed
        MainFrame.setLayout(new FlowLayout());	//not strictly necessary
        MainFrame.add(this);					//"this" is this object that extends turtle graphics so we are adding a turtle graphics panel to the frame
        MainFrame.pack();						//set the frame to a size we can see
        MainFrame.setVisible(true);				//now display it
        //setTurtleImage("turtle.png");
        setGUIVisible(false);
        setInternalTurtle(3);
        about();								//call the LBUGraphics about method to display version information.
    }


    public void processCommand(String command)
    {
        System.out.println(command+" is not implemented");
    }
}
