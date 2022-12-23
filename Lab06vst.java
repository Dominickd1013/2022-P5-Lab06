// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab06vst extends Applet {

    public void paint(Graphics g) {
        // Draw Grid
        g.drawRect(10, 10, 780, 580);
        g.drawLine(400, 10, 400, 590);
        g.drawLine(10, 300, 790, 300);

        // Draw Random Lines
        Random rndint = new Random();

        for (int x = 1; x <= 100; x++) {
            // Lines (Length and location)
            int x1 = rndint.nextInt(380) + 10;
            int y1 = rndint.nextInt(280) + 10;
            int x2 = rndint.nextInt(380) + 10;
            int y2 = rndint.nextInt(280) + 10;

            // Colors
            int red = rndint.nextInt(255);
            int green = rndint.nextInt(255);
            int blue = rndint.nextInt(255);

            g.drawLine(x1, y1, x2, y2);
            g.setColor(new Color(red, green, blue));
            // increments the loop +1
            x += 1;
        }

        // Draw Random Squares
        for (int x = 1; x <= 100; x++) {
            // Squares (Location)
            int x1 = rndint.nextInt(331) + 410;
            int y1 = rndint.nextInt(231) + 15;

            // Colors
            int red = rndint.nextInt(255);
            int green = rndint.nextInt(255);
            int blue = rndint.nextInt(255);

            g.fillRect(x1, y1, 50, 50);
            g.setColor(new Color(red, green, blue));
            // increments the loop +1
            x += 1;
        }

        // Draw Random Circles
        for (int x = 1; x <= 100; x++) {
            // Circles (Location)
            int x1 = rndint.nextInt(95) + 50;
            int y1 = rndint.nextInt(95) + 300;

            // Circles (Size)
            int width_height = rndint.nextInt(200);

            // Colors
            int red = rndint.nextInt(255);
            int green = rndint.nextInt(255);
            int blue = rndint.nextInt(255);

            g.drawOval(x1, y1, width_height, width_height);
            g.setColor(new Color(red, green, blue));
            // increments the loop +1
            x += 1;
        }

        // Draw 3-D Box
        {
            g.setColor(new Color(255, 0, 0));
            g.fillRect(575, 450, 100, 100);

            // draws blue triangle
            {
                int leftpoint = 625;
                int leftpointheight = 450;
                int midpoint = 625;
                int midpointheight = 390;
                int rightpoint = 675;
                int rightpointheight = 450;

                int x[] = {leftpoint, midpoint, rightpoint};
                int y[] = {leftpointheight, midpointheight, rightpointheight};

                Color blue = new Color(0, 0, 255);
                g.setColor(blue);
                g.fillPolygon(x, y, 3);
            }

            {
                // draws yellow right trapezoid
                g.setColor(new Color(255, 255, 0));
                g.fillRect(500, 390, 125, 60);
            }

            // draws green rhombus (square)
            g.setColor(new Color(0, 255, 0));
            g.fillRect(500, 450, 75, 100);

            {
                int leftpoint = 475;
                int leftpointheight = 550;
                int midpoint = 475;
                int midpointheight = 475;
                int rightpoint = 575;
                int rightpointheight = 550;

                int x[] = {leftpoint, midpoint, rightpoint};
                int y[] = {leftpointheight, midpointheight, rightpointheight};

                Color white = new Color(255, 255, 255);
                g.setColor(white);
                g.fillPolygon(x, y, 3);
            }

            int leftpoint = 500;
            int leftpointheight = 450;
            int midpoint = 500;
            int midpointheight = 390;
            int rightpoint = 575;
            int rightpointheight = 450;

            int x[] = {leftpoint, midpoint, rightpoint};
            int y[] = {leftpointheight, midpointheight, rightpointheight};

            Color white = new Color(0, 255, 0);
            g.setColor(white);
            g.fillPolygon(x, y, 3);

        }

    }
}