import java.applet.Applet;
import java.awt.*;
import javax.swing.*;
import java.util.*;
 
public class applet2 extends Applet{
 
        public void paint(Graphics g){
               
                g.drawRect(10,10,50,100);
                g.setColor(Color.red);
                g.drawRect(100,100,50,50);
				g.fillRect(100,100,50,50);
				g.setColor(Color.blue);
				g.fillOval(50,100,50,100);
				g.setColor(Color.red);
        }
}