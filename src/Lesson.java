import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Hp on 17.11.2017.
 */
public class Lesson {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        jFrame.add(new myComponent());

    }
    static class  myComponent extends JComponent{
        @Override
        protected void paintComponent(Graphics g) {
            Font font = new Font("Bitstream Charset", Font.BOLD, 20);
            Graphics2D g2 = (Graphics2D) g;
            g2.setFont(font);
            g2.drawString("hello world", 50, 50);
            Line2D line2D = new Line2D.Double(50, 50, 170, 170);
            Point2D p1 = new Point2D.Double(150, 170);
            Point2D p2 = new Point2D.Double(150, 170);
            Ellipse2D el = new Ellipse2D.Double(70, 70, 170, 170);

            g2.fill(el);
            g2.draw(line2D);
            g2.setPaint(Color.blue);
            Rectangle2D r2 = new Rectangle2D.Double(70, 70, 170, 170);
            g2.draw(r2);

            Image image = new ImageIcon("Image/images.jpg").getImage();
            g2.drawImage(image,220,150,null);
        }

    }
    static JFrame getFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-250,dimension.height/2-150,500,300);
        return jFrame;
    }
}
