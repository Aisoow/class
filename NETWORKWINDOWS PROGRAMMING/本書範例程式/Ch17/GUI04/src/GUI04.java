import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI04 {
    private JPanel rootPanel;
    private JTextField txtInput;
    private JComboBox cboApple;
    private JLabel lblOutput;

    public GUI04() {
        txtInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField s = (JTextField) e.getSource();
                lblOutput.setText(s.getText());
            }
        });
        cboApple.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox c = (JComboBox) e.getSource();
                lblOutput.setText((String) c.getSelectedItem());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI04");
        frame.setContentPane(new GUI04().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
