import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI06 {
    private JPanel rootPanel;
    private JComboBox cboType;
    private JButton btnSelect;
    private JLabel lblOutput;

    public GUI06() {
        btnSelect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String type = (String) cboType.getSelectedItem();
                lblOutput.setText(type);
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
