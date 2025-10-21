import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI07 {
    private JPanel rootPanel;
    private JTextField txtUsername;
    private JPasswordField pasPassword;
    private JButton btnLogin;
    private JLabel lblOutput;

    public GUI07() {
        btnLogin.addActionListener(e -> lblOutput.setText("使用者: " + txtUsername.getText() +
                "- 密碼: " + new String(pasPassword.getPassword())));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI07");
        frame.setContentPane(new GUI07().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}