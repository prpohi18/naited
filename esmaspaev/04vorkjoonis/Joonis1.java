import java.awt.image.*;
import javax.imageio.*;
import java.awt.*;
import java.io.*;
public class Joonis1{
    public static void main(String[] arg) throws Exception{
        BufferedImage bi=new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB);
        Graphics g=bi.createGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 400, 300);
        g.setColor(Color.GREEN);
        g.fillRect(10, 20, 380, 260);
        g.setColor(Color.BLUE);
        g.drawLine(50, 20, 50, 280);
        g.drawOval(100, 50, 60, 40);
        g.drawString("Tere", 110, 70);
        ImageIO.write(bi, "png", new File("pilt1.png"));
    }
}