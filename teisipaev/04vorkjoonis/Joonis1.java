import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
public class Joonis1{
    public static void main(String[] arg) throws Exception{
        BufferedImage bi=new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB);
        Graphics g=bi.createGraphics();
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, 400, 300);
        g.setColor(Color.BLUE);
        g.fillRect(10, 20, 30, 40); //vasakult, ülalt, laius, kõrgus
        g.drawLine(50, 10, 50, 60); //x1, y1, x2, y2
        g.drawOval(60, 10, 50, 40); //vasakult, ülalt, laius, kõrgus
        g.drawString("abc", 110, 30);
        ImageIO.write(bi, "png", new File("pilt1.png"));
        
    }
}