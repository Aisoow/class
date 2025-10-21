import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI02 {
    private JPanel rootPanel;
    private JTextField txtUsername;
    private JPasswordField pasPassword;
    private JButton btnLogin;
    private JLabel lblOutput;

    public GUI02() {
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblOutput.setText("使用者: " + txtUsername.getText() +
                 "- 密碼: " + new String(pasPassword.getPassword()));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI02");
        frame.setContentPane(new GUI02().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
