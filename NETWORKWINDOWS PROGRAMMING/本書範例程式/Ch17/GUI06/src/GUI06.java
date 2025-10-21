import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class GUI06 {
    private JPanel rootPanel;
    private JList lstNames;
    private JLabel lblOutput;

    public GUI06() {
        lstNames.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting() == false)
                    if ( lstNames.getSelectedIndex() != -1 ) {
                        String name = lstNames.getSelectedValue().toString();
                        lblOutput.setText(name);
                    }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI06");
        frame.setContentPane(new GUI06().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
