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

        Random rndint  = new Random(1234);
        // lets 50 lines be drawn
        for(int x = 1; x <= 100; x++)
        {
            // Lines (Length and location)
            int x1 = rndint.nextInt(391)+10;
            int y1 = rndint.nextInt(291)+10;
            int x2 = rndint.nextInt(391)+10;
            int y2 = rndint.nextInt(291)+10;

            // Colors
            int red = rndint.nextInt(255);
            int green = rndint.nextInt(255);
            int blue = rndint.nextInt(255);

            g.drawLine(x1, y1, x2, y2);
            g.setColor(new Color(red,green,blue));
            // increments the loop +1
            x += 1;
        }

        // Draw Random Squares





        // Draw Random Circles





        // Draw 3-D Box





    }

}



    
 