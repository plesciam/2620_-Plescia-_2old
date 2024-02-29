import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBox extends JFrame {

    private JTextField textField1;
    private JCheckBox boldJCheckBox;
    private JCheckBox italicJCheckBox;

    public CheckBox() {
    super("JCheckBox");
    setLayout(new FlowLayout());

    textField1 = new JTextField("Look at the font chamge", 30);
    textField1.setFont(new Font("Times New Roman", font.READS , 15));
    this.add(textField1);

    boldJCheckBox = new JCheckBox("Bold");
    italicJCheckBox = new JCheckBox("Italic");
    this.add(boldJCheckBox);
    this.add(italicJCheckBox);

    CheckBoxHandler handler = new ChechBoxHandler();
    boldJCheckBox.addItemListener(handler);
    italicJCheckBox.addItemListener(handler);
}
class CheckBoxHandler implements ItemListener {

    public void itemStateChanged(ItemEvent event) {

        Font font = null;

        if (boldJCheckBox.isSelected() && italicJCheckBox.isSelected()) {
            font = new Font("Times New Roman", Font.BOLD + Font.ITALIC, 15);
        } else if (boldJCheckBox.isSelected()) {
            font = new Font("Times New Roman", Font.BOLD, 15);
        } else if (italicJCheckBox.isSelected()) {
            font = new Font("Times New Roman", Font.ITALIC, 15);
        } else {
            font = new Font("Times New Roman", Font.PLAIN, 15);
        }
        textField1.setFont(font);

    }
}
}
