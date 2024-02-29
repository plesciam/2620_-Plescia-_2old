import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyBoardEvents extends JFrame implements KeyListener {
    private String line1 = "", line 2 = "", line3 = "";
    private JTextArea tecArea;
}
public KeyBoardEvents() {
    super("keyboard");

    textArea = new JTextArea(10,15);
    textArea = setText("Press any key");
    textArea.setEnabled(false);
    textArea.setDisabledTextColoe(Color.BLACK);

    addKeyListener(this);
}
    public void keyTyped(KeyEvent e) {
    line1 = String.format("Key Typed %c", e.getKeyChar());
    setLines2And3(e);
    }
