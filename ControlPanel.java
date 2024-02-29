import java.awt.GridLayout;

import javax.swing.JPanel;

public class ControlPanel extends JPanel {

    public ControlPanel(GUIPicture guiPicture) {
        setLayout(new GridLayout(0,2,5,5)); 
        this.add(new LoadButton());
       this.add(new SaveButton());
    }
    
}
