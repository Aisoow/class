import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI05 {
    private JPanel rootPanel;
    private JRadioButton rdbMale;
    private JRadioButton rdbFemale;
    private JButton btnGender;
    private JLabel lblOutput;

    public GUI05() {
        btnGender.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( rdbMale.isSelected() )
                    lblOutput.setText("選擇男性");
                else
                    lblOutput.setText("選擇女性");
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
