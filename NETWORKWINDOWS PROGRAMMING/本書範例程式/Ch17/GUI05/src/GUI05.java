import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class GUI05 {
    private JRadioButton rdbRed;
    private JRadioButton rdbBlue;
    private JCheckBox chkGreen;
    private JPanel rootPanel;
    private JLabel lblOutput;

    public GUI05() {
        chkGreen.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED)
                    lblOutput.setText("綠色");
                else
                    lblOutput.setText("白色");
            }
        });
        rdbRed.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                lblOutput.setText("紅色");
            }
        });
        rdbBlue.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                lblOutput.setText("藍色");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI05");
        frame.setContentPane(new GUI05().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
