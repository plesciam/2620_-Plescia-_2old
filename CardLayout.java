import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CardLayout extends JFrame implements ItemListener {

    private JPanel cards;
    private static final String ButtonPanel = "Card with JButtons";
    private static final String TextPanel = "Card with TextPanel";

public CardLayout() {

    JPanel comboBoxPanel = new JPanel();
    String comboBoxItems[] = {ButtonPanel, TextPanel};
    JComboBox cb = new JComboBox(comboBoxItems);
    cb.setEditable(false);
    cb.addItemListener((ItemListener) this);
    comboBoxPanel.add(cb);

    JPanel card1 = new JPanel();
    card1.add(new JButton("Button 1"));
    card1.add(new JButton("Button 2"));
    card1.add(new JButton("Button 3"));
    JPanel card2 = new JPanel();
    card2.add(new JTextField("TextField", 15));


    cards = new JPanel();
    cards.add(card1, ButtonPanel);
    cards.add(card2, TextPanel);

    this.add(comboBoxPanel, BorderLayout.PAGE_START);
    this.add(cards, BorderLayout.CENTER);
}
public void itemStateChanged(ItemEvent e) {
   CardLayout cl = (CardLayout) (cards.getLayout());
   cl.show(cards, (String) event.getItems());
}

}
