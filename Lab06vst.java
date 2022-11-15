// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab06vst extends Applet
{

    public void paint(Graphics g)
    {
        // Draw Grid
        g.drawRect(10,10,780,580);
        g.drawLine(400,10,400,590);
        g.drawLine(10,300,790,300);



        // Draw Random Lines
        Random rndint  = new Random(12345);
        for(int x = 1; x <= 50; x++)
        {
            int x1 = rndint.nextInt(50)
            int y1 = rndint.nextInt(50)
            int x2 = rndint.nextInt(150)
            int y2 = rndint.nextInt(150)

            g.setColor(new Color(225, 0, 0));
            g.drawLine(x1, y2, x2, y2);
            x += 1;
        }



        // Draw Random Squares





        // Draw Random Circles





        // Draw 3-D Box





    }

}



    
 