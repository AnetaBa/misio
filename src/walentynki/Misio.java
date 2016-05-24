package walentynki;


import java.applet.Applet;
import java.awt.*; 

public class Misio extends Applet
{
	Applet applet = this;
	Image img, picture;
	
	public void init()
	{
		applet.setSize(500,400);
		applet.setBackground(Color.GREEN);	
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.BLACK);
		Font font = new Font ("New Times Roman", Font.BOLD, 24);
		g.setFont(font);
		g.drawString("Kocham Ciê :*  ", 125, 250);
		
		g.drawArc(100, 50, 100, 100, 0, 225);
		g.drawArc(200, 50, 100, 100, -45, 225);
		g.drawLine(114, 134, 200, 213);
		g.drawLine(286, 134, 200, 213);		

		img = getImage(getDocumentBase(), "misiek.gif");
		g.drawImage(img, 300, 25, this);
				
		picture = getImage(getDocumentBase(), "atari.png");
        for(int i=0;i<500;i++)
        {  
            g.drawImage(picture, i, 260, this);  
            try
            {
            	Thread.sleep(25);
            }
            catch(Exception e){}  
         }  
	}
	
}