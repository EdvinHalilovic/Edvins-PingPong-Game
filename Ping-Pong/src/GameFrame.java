import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class GameFrame extends JFrame{
	GamePanel panel;
	
	
	
	
	     GameFrame()	{
		panel=new GamePanel();
		this.add(panel);
		this.setTitle("Edvin Halilovic Pong Game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // specify one of several options for the close button.
		this.pack(); // to be sized in a preferred size we will not need to adjust the jframe it will set to the right frame
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}

}
