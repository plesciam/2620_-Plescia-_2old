import java.awt.Color;
import java.awt.Graphics;
//import java.awt.Graphics2D;
import javax.swing.JPanel;

/** 
*
* @author plesciam
*/
public class MyPicture extends JPanel {
    
    public MyPicture() {


    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        System.out.println("Hello");


       //Graphics2D g2 = (Graphics2D) g;

        g.setColor(Color.BLUE);
        g.drawRect(100, 100, 100, 100);
        g.setColor(Color.RED);
        g.draw3DRect(50,50,50,50, false);
        g.setColor(Color.BLACK);
        g.fillRect(50,100,50,100);

    }
}
