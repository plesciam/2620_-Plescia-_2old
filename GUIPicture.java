import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JPanel;
import java.awt.FlowLayout;
//import java.awt.GridLayout;



public class GUIPicture extends JFrame {

    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    //private MyPicture PicturePanel;
    
    public GUIPicture() throws IOException {
        super("Picture Demo");
        this.setLayout(new FlowLayout());
        

       // label1 = new JLabel("This is a label");
       // label1.setToolTipText("This is label 1");
        
        Image img = null;
        img = ImageIO.read(new File("image.png"));
        label2 = new JLabel(new ImageIcon(img));
        
        button1 = new JButton("Exit");
        
        add(label1);
        add(button1);
        add(label2);
    }
    
}
  



 
    
 

    



    
    
        
    
    
    
    

